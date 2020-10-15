package io.github.mhamooei.machinelearning;

import io.github.mhamooei.Config;
import io.github.mhamooei.Main;
import io.github.mhamooei.antlrparser.InjectionLexer;
import io.github.mhamooei.antlrparser.InjectionParser;
import io.github.mhamooei.enums.GrammarItemType;
import io.github.mhamooei.models.Attack;
import io.github.mhamooei.models.GrammarItem;
import io.github.mhamooei.models.PathCondition;
import io.github.mhamooei.models.Slice;
import io.github.mhamooei.utils.AttackCollection;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class MlAttackGenerator {
    public List<Attack> chooseAttack(List<PathCondition> pathConditions){
        List<Attack> attacks = Main.trainData;
        List<Attack> chosen = new ArrayList<>();
        boolean addToList;
        for (PathCondition pathCondition : pathConditions){
            for (Iterator<Attack> iterator = attacks.iterator(); iterator.hasNext(); ){
                addToList = true;
                Attack attack = iterator.next();
                ArrayList<String> slices = new ArrayList<>(attack.getSlices());
                for (String condition : pathCondition.getPath()){
                    if (condition.startsWith("+")){
                        if (!slices.contains(Slice.slices.get(Integer.valueOf(condition.substring(2).trim())))){
                            addToList = false;
                            break;
                        }else {
                            String s = Slice.slices.get(Integer.valueOf(condition.substring(2).trim()));
                            List<String> relatives = getRelatives(attack.getSlices(), s);
                            slices.remove(s);
                            for (String r : relatives)
                                slices.remove(r);
                        }
                    }else {
                        if (slices.contains(Slice.slices.get(Integer.valueOf(condition.substring(2).trim())))){
                            addToList = false;
                            break;
                        }
                    }
                }
                if (addToList) {
                    List<String> forbidden = new ArrayList<>();
                    for (String condition : pathCondition.getPath()){
                        if (condition.startsWith("-")) {
                            String fb = Slice.slices.get(Integer.valueOf(condition.substring(2).trim()));
                            fb = fb.substring(fb.indexOf(".") + 1);
                            fb = fb.substring(fb.indexOf(".") + 1);
                            forbidden.add(fb);
                        }
                    }
                    attack.setPathVector(pathCondition.getPath());
                    attack.setForbiddenOutPuts(forbidden);
                    attack.setSlices(slices);
                    attack.setScore(pathCondition.getScore());
                    chosen.add(attack);
                    iterator.remove();
                }
            }
        }
        return chosen;
    }
    public List<String> mutateAttacks(List<Attack> attacks){
        List<String> newAttacks = new ArrayList<>();
        String current, parent, outPut;
        double total_score= attacks.stream().mapToDouble(Attack::getScore).sum();
        boolean addAttack;

        //try (ProgressBar pb = new ProgressBar("Mutating Attacks", Config.tryRate)) {
        int c = 0;
        for (Attack attack : attacks) {
            c++;
            int c_offspring = Math.toIntExact(Math.round((attack.getScore() / total_score) * Config.lambda))+1;

            int n_offspring = 0;
            //if (newAttacks.size() >= Config.mutatedAttackCounts)
            //    break;

            for (int k = 0; k < (Config.tryRate *c_offspring); k++) {
                //pb.step();
                //System.out.println(k);
                addAttack = true;
                List<String> toChange = selectRandomSlice(attack);
                String attackString = attack.getAttack();
                for (String s : toChange) {
                    current = s.substring(0, s.indexOf("."));
                    parent = s.substring(s.indexOf(".") + 1);
                    outPut = parent.substring(parent.indexOf(".") + 1);
                    //parent = parent.substring(0, parent.indexOf("."));
                    //System.out.println("c: "+ attackString);
                    CharStream in = CharStreams.fromString(attack.getAttack());
                    InjectionLexer lexer = new InjectionLexer(in);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    InjectionParser parser = new InjectionParser(tokens);

                    ParseTree parseTree = findPathTree(parser, parser.start(), outPut, current);
                    int forbiddenIndex = findIndex(parser, parseTree, current);
                    ArrayList<List<GrammarItem>> grammarItems = new ArrayList<>(Attack.generationDictionary.get(current));
                    grammarItems.remove(forbiddenIndex);
                    if (grammarItems.size() == 0){
                        addAttack = false;
                        break;
                    }
                    List<GrammarItem> items = grammarItems.get(new Random().nextInt(grammarItems.size()));
                    StringBuilder sb = new StringBuilder();
                    for (GrammarItem item : items) {
                        if (item.getType() == GrammarItemType.TERMINAL)
                            sb.append(item.getItem());
                        else
                            sb.append(visitChild(item.getItem()));
                    }
                    String relative = sb.toString();
                    if (attack.getForbiddenOutPuts().contains(relative)) {
                        addAttack = false;
                        break;
                    }
                    in = CharStreams.fromString(attackString);
                    lexer = new InjectionLexer(in);
                    tokens = new CommonTokenStream(lexer);
                    parser = new InjectionParser(tokens);
                    parseTree = parser.start();
                    attackString = replaceAlternatives(parser, parseTree, outPut, current, relative);
                    //attackString = attackString.replaceAll(Pattern.quote(outPut), Matcher.quoteReplacement(relative));
                    //System.out.println("n: "+ attackString);
                }
                //System.out.println(attackString);
                //System.out.println(n_offspring);
                if (addAttack && !AttackCollection.containsAttack(Main.attacks, attackString) && !newAttacks.contains(attackString)) {
                    newAttacks.add(attackString);
                    n_offspring++;
                    if (n_offspring == c_offspring)
                        break;

                }

            }
        }
        // }
        return newAttacks;
    }

    private String replaceAlternatives(InjectionParser parser, ParseTree parseTree, String outPut, String node, String alternative){
        int count = parseTree.getChildCount();
        StringBuilder sb = new StringBuilder();
        String s;
        if (isMinimal(parseTree)) {
            s = parseTree.toStringTree(parser);
            s = s.substring(1, s.indexOf(' '));
            if (s.equals(node) && parseTree.getText().equals(outPut))
                return alternative;
            return parseTree.getText();
        }
        for (int i = 0; i < count; i++) {
            ParseTree tree = parseTree.getChild(i);
            s = tree.toStringTree(parser);
            s = s.substring(1, s.indexOf(' '));
            if (s.equals(node) && tree.getText().equals(outPut))
                sb.append(alternative);
            else sb.append(replaceAlternatives(parser, tree, outPut, node, alternative));
        }
        return sb.toString();
    }
    private boolean isMinimal(ParseTree tree){
        return tree.getChild(0).getChildCount() == 0;
    }
    private ParseTree findPathTree(InjectionParser parser, ParseTree parseTree, String outPut, String node){
        int count = parseTree.getChildCount();
        for (int i = 0; i < count; i++) {
            ParseTree tree = parseTree.getChild(i);
            String s = tree.toStringTree(parser);
            if (tree.getChildCount() == 0)
                return null;
            s = s.substring(1, s.indexOf(' '));
            if (s.equals(node) && tree.getText().equals(outPut))
                return tree;
            ParseTree rTree = findPathTree(parser, tree, outPut, node);
            if (rTree != null)
                return rTree;
        }
        return null;
    }

    private int findIndex(InjectionParser parser, ParseTree tree, String node){
        List<List<GrammarItem>> grammarItems = Attack.generationDictionary.get(node);
        List<String> nodes = new ArrayList<>();
        boolean returnIndex;
        for (int i = 0; i < tree.getChildCount(); i++) {
            String s = tree.getChild(i).toStringTree(parser);
            if (tree.getChild(i).getChildCount() == 0)
                s = tree.getChild(i).getText();
            else
                s = s.substring(1, s.indexOf(' '));
            nodes.add(s);
        }

        for (int i = 0; i < grammarItems.size(); i++) {
            List<GrammarItem> grammarItem = grammarItems.get(i);
            returnIndex = true;
            if (grammarItem.size() == nodes.size()){
                for (int j = 0; j < nodes.size(); j++) {
                    if (!grammarItem.get(j).getItem().equals(nodes.get(j))){
                        returnIndex = false;
                        break;
                    }
                }
                if (returnIndex)
                    return i;
            }
        }
        return -1;
    }
    private List<String> getRelatives(List<String> slices, String slice){
        List<String> relatives = new ArrayList<>();
        String sliceOut = slice.substring(slice.indexOf(".") + 1);
        sliceOut = sliceOut.substring(sliceOut.indexOf(".") + 1);
        for (String s : slices){
            String sOut = s.substring(s.indexOf(".") + 1);
            sOut = sOut.substring(sOut.indexOf(".") + 1);
            if (sOut.contains(sliceOut) || sliceOut.contains(sOut))
                relatives.add(s);
        }
        return relatives;
    }

    private List<String> selectRandomSlice(Attack attack){
        Random rand = new Random();
        ArrayList<String> slices = new ArrayList<>(attack.getSlices());
        ArrayList<String> chosen = new ArrayList<>();
        int count = Config.countOfAlternatives;
        if(slices.size() < count)
            count = slices.size();
        List<String> relatives;
        String s;
        while (slices.size() > 0 && chosen.size() < count) {
            s = slices.get(rand.nextInt(slices.size()));
            chosen.add(s);
            slices.remove(s);
            relatives = getRelatives(slices, s);
            for (String r : relatives)
                slices.remove(r);
        }
        return chosen;
    }

    private String visitChild(String p){
        StringBuilder stringBuilder = new StringBuilder();

        List<GrammarItem> selected_child = randomlySelect(p);
        for (GrammarItem grammarItem : selected_child){
            if (grammarItem.getType() == GrammarItemType.TERMINAL)
                stringBuilder.append(grammarItem.getItem());
                //s= s+ grammarItem.getItem();
            else
                stringBuilder.append(visitChild(grammarItem.getItem()));
        }
        return stringBuilder.toString();
    }
    private List<GrammarItem> randomlySelect(String p){
        List<List<GrammarItem>> childes = Attack.generationDictionary.get(p);
        Double[] chance = new Double[childes.size()];
        for (int i = 0; i < childes.size(); i++) {

            chance[i] = 100.0 / chance.length;
        }
        Double random = new Random().nextDouble() * 100;
        Double sum = 0.0;
        for (int i = 0; i < chance.length; i++) {
            sum += chance[i];
            if (random < sum)
                return childes.get(i);
        }
        return childes.get(childes.size()-1);


    }
}
