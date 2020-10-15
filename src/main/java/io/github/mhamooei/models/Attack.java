package io.github.mhamooei.models;

import com.google.gson.Gson;
import io.github.mhamooei.enums.GrammarItemType;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;

public class Attack {
    /**
     * generationDictionary is hash map which is created from grammar
     * it's used to generate attacks
     */
    public static Dictionary<String, List<List<GrammarItem>>> generationDictionary = new Hashtable<>();
    private String attack;
    private String label;
    private List<String> slices;
    private String[] pathVector;
    private List<String> forbiddenOutPuts;
    private double score;
    public Attack(String attack, String label) {
        this.attack = attack;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public List<String> getSlices() {
        return slices;
    }

    public void setSlices(List<String> slices) {
        this.slices = slices;
    }

    public void clearSlices() {
        if (slices != null)
            this.slices.clear();
    }

    public String[] getPathVector() {
        return pathVector;
    }

    public void setPathVector(String[] pathVector) {
        this.pathVector = pathVector;
    }

    public String getAttack() {
        return attack;
    }

    public List<String> getForbiddenOutPuts() {
        return forbiddenOutPuts;
    }

    public void setForbiddenOutPuts(List<String> forbiddenOutPuts) {
        this.forbiddenOutPuts = forbiddenOutPuts;
    }
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public static void buildGenerationDictionary(){
        File file =
                new File(Attack.class.getResource("/Injection.g4").getPath());
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                if (!(str.trim().startsWith("grammar") || str.isEmpty() || str.trim().startsWith("//"))) {
                    String[] part = str.split(":");
                    String key = part[0].trim();
                    String content = part[1].trim();
                    content = content.substring(0,content.length()-1);
                    String[] cpart = content.split("\\|(?=(?:[^']*'[^']*')*[^']*$)");
                    ArrayList<List<GrammarItem>> higherItems = new ArrayList<>();
                    for(String s : cpart){
                        String[] item = s.trim().split("\\s+(?=(?:[^']*'[^']*')*[^']*$)");
                        ArrayList<GrammarItem> grammarItems = new ArrayList<>();
                        for(String i : item){
                            if (i.startsWith("'") && i.endsWith("'")){
                                String token = i.substring(1,i.length()-1);
                                if (token.startsWith("\\"))
                                    token = token.substring(1);
                                grammarItems.add(new GrammarItem(GrammarItemType.TERMINAL,token));
                                //System.out.println(token);
                            }else {
                                //System.out.println(i);
                                grammarItems.add(new GrammarItem(GrammarItemType.NONE_TERMINAL,i));
                            }

                        }
                        higherItems.add(grammarItems);
                    }
                    generationDictionary.put(key,higherItems);
                }
            }
            //System.out.println(dictionary.get("start").get(0).get(0).getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            if (!generationDictionary.isEmpty()){
                for (List<GrammarItem> items : generationDictionary.get("start"))
                    for (GrammarItem grammarItem : items)
                        rankRules(grammarItem,"start");
            }
            String json = new Gson().toJson(generationDictionary);
            System.out.println(json);
        }

    }
    private static BigInteger rankRules(GrammarItem grammarItem, String parent){
        switch (grammarItem.getType()){
            case NONE_TERMINAL :
                BigInteger result = new BigInteger("0");
                for (List<GrammarItem> items : generationDictionary.get(grammarItem.getItem())){
                    BigInteger m = new BigInteger("1");
                    for (GrammarItem item : items) {
                        m = m.multiply(rankRules(item, grammarItem.getItem()));
                    }
                    result = result.add(m);
                }
                for (List<GrammarItem> items : generationDictionary.get(parent))
                    for (GrammarItem item : items)
                        if (item.getItem().equals(grammarItem.getItem()))
                            item.setScore(result);

                return result;

            case TERMINAL :
                for (List<GrammarItem> items : generationDictionary.get(parent))
                    for (GrammarItem item : items)
                        if (item.getItem().equals(grammarItem.getItem()))
                            item.setScore(BigInteger.ONE);
                return BigInteger.ONE;

        }
        return BigInteger.ZERO;
    }
}
