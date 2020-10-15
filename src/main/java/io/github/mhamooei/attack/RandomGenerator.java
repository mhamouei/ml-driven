package io.github.mhamooei.attack;

import io.github.mhamooei.Config;
import io.github.mhamooei.enums.GrammarItemType;
import io.github.mhamooei.models.Attack;
import io.github.mhamooei.models.GrammarItem;
import me.tongfei.progressbar.ProgressBar;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class RandomGenerator {

    public List<String> generate(){
        List<String> tests = new ArrayList<>();
        String test = "";
        try (ProgressBar pb = new ProgressBar("Generating Attacks", Config.initialAttackCounts)) {
            while (tests.size() < Config.initialAttackCounts) {
                //System.out.println(randomlySelect("start").get(0).getItem());
                test = VisitChildren(randomlySelect("start").get(0).getItem());

                if (!tests.contains(test)) {
                    tests.add(test);
                    //System.out.println(tests.size() + " of " + Config.initialAttackCounts + " Completed");
                    pb.step();
                }
            }
        }
        return tests;
    }
    private String VisitChildren(String p){
        StringBuilder stringBuilder = new StringBuilder();

        List<GrammarItem> selected_child = randomlySelect(p);
        for (GrammarItem grammarItem : selected_child){
            if (grammarItem.getType() == GrammarItemType.TERMINAL)
                stringBuilder.append(grammarItem.getItem());
                //s= s+ grammarItem.getItem();
            else
                stringBuilder.append(VisitChildren(grammarItem.getItem()));
        }
        return stringBuilder.toString();
    }
    private List<GrammarItem> randomlySelect(String p){
        List<List<GrammarItem>> children = Attack.generationDictionary.get(p);
        Double[] chance = new Double[children.size()];
        BigInteger total = BigInteger.ZERO;
        for (List<GrammarItem> items : children){
            BigInteger pathScore = BigInteger.ONE;
            for (GrammarItem item : items)
                pathScore = pathScore.multiply(item.getScore());
            total = total.add(pathScore);
        }
        for (int i = 0; i < children.size(); i++) {
            List<GrammarItem> path = children.get(i);
            BigInteger pathScore = BigInteger.ONE;
            for (GrammarItem item : path)
                pathScore = pathScore.multiply(item.getScore());

            if (Config.randomWithProbability)
                chance[i] = BigDecimal.valueOf(pathScore.doubleValue()).multiply(BigDecimal.valueOf(100))
                        .divide(BigDecimal.valueOf(total.doubleValue()), RoundingMode.UP).doubleValue();
            else
                chance[i] = 100.0 / chance.length;
        }
        Double random = new Random().nextDouble() * 100;
        Double sum = 0.0;
        //if (p.equals("start"))
            //for (Double d : chance)
                //System.out.println(d);
        for (int i = 0; i < chance.length; i++) {
            sum += chance[i];
            if (random < sum)
                return children.get(i);
        }
        return children.get(children.size()-1);


    }
}
