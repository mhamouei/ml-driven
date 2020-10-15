package io.github.mhamooei.machinelearning;

import io.github.mhamooei.Config;
import io.github.mhamooei.Main;
import io.github.mhamooei.models.PathCondition;
import io.github.mhamooei.models.Slice;
import weka.attributeSelection.AttributeSelection;
import weka.attributeSelection.InfoGainAttributeEval;
import weka.attributeSelection.Ranker;
import weka.classifiers.trees.RandomTree;
import weka.core.Instances;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DecisionTree {

    public RandomTree build(Instances data) throws Exception {
        System.out.println("Building Decision Tree...");
        InfoGainAttributeEval eval = new InfoGainAttributeEval();
        Ranker search = new Ranker();
        AttributeSelection attSelect = new AttributeSelection();
        attSelect.setEvaluator(eval);
        attSelect.setSearch(search);
        attSelect.SelectAttributes(data);
        //System.out.println(attSelect.toResultsString());
        RandomTree tree = new RandomTree();
        //int step = (Config.treeFeatureMax - Config.treeFeatureMin) / Config.epochs;
        //int percent = Config.treeFeatureMin + ((Main.currentEpoch - 1) * step);
        //int percent = 50;
        //int k = (percent * Slice.slices.size()) / 100;
        //tree.setKValue(k);
        //tree.setMaxDepth(Config.treeDepth);
        //tree.setMinNum(0);
        //tree.setAllowUnclassifiedInstances(false);
        //tree.setNumFolds(0);
        // System.out.println(attSelect.toResultsString());

        tree.buildClassifier(data);
        return tree;
    }

    public List<PathCondition> getPathConditions(RandomTree randomTree) {

        String tree = randomTree.toString();
        //System.out.println(tree);
        String[] lines = tree.split("\n");
        for (String l : lines)
            l = "| "+ l;
        List<List<String>> lists = new ArrayList<List<String>>();
        // Break lines into parts.
        for(String line : lines){
            List<String> temp = new ArrayList<String>();
            while(line.contains("|")){
                temp.add("|");
                line = line.replaceFirst("\\|", "");
            }
            temp.add(line.trim());
            lists.add(temp);
        }
        //for (List<String> list : lists) {
        //System.out.println(list);}
        // remove first 3 lines of the output.
        for(int i = 0; i < 4; i++){
            lists.remove(0);
        }
        // remove last 4 lines of the output.
        for(int i = 0; i < 3; i++){
            lists.remove(lists.size()-1);
        }

        // This is a ordered list of parents for any given node while traversing the tree.
        List<String> parentClauses = new ArrayList<String>();
        // this describes the depth
        //int depth = -1;

        // all the paths in the tree.
        List<List<String>> paths = new ArrayList<List<String>>();


        for (List<String> list : lists) {
            //System.out.println(list);
            int currDepth = 0;
            for(int i = 0; i < list.size(); i++){
                String token = list.get(i);
                // find how deep is this node in the tree.
                if (token.equals("|")) {
                    currDepth++;
                }
                else {    // now we get to the string token for the node.
                    // if leaf, so we get one path..
                    if (token.contains(":")) {
                        List<String> path = new ArrayList<String>();
                        for (int index = 0; index < currDepth; index++) {
                            path.add(parentClauses.get(index));
                        }
                        path.add(token);
                        paths.add(path);
                    }
                    else {
                        // add this to the current parents list
                        parentClauses.add(currDepth, token);
                    }
                }
            }
        }
        String[] sp1,sp2,sp3,sp4;
        String label;
        Double score = 0.0;
        // print each of the paths.
        List<String> pathContidions = new ArrayList<>();
        for (List<String> path : paths) {
            String str = "";
            for (String token : path) {
                if (token.contains("<")){
                    sp1 = token.split("<");
                    if (token.contains(":")){
                        //score(token);
                        token = ("-"+sp1[0]+":"+ score(token)).trim();
                        str += token;
                    }else {
                        token = ("-" + sp1[0]).trim();
                        str += token + "&";
                    }
                }else if (token.contains(">=")){
                    sp1 = token.split(">=");
                    if (token.contains(":")){
                        //score(token);
                        token = ("+"+sp1[0]+":"+ score(token)).trim();
                        str += token;
                    }else {
                        token = ("+" + sp1[0]).trim();
                        str += token + "&";
                    }
                }
                //str += token + "&";
            }
            //System.out.println(str + "\n");
            pathContidions.add(str);
        }
        List<PathCondition> pathConditionList = new ArrayList<>();
        for (String s : pathContidions){
            String[] split = s.split(":");
            String[] conditions = split[0].split("&");
            pathConditionList.add(new PathCondition(conditions,Double.parseDouble(split[split.length-1])));
        }
        pathConditionList.sort(Comparator.comparingDouble(PathCondition::getScore).reversed());
        //int count = top_rated_percentage * pathConditionList.size() / 100;
        //if (count > 20)
        List<PathCondition> selected = new ArrayList<>();
        for (PathCondition pathCondition : pathConditionList)
            if (pathCondition.getScore()>0)
                selected.add(pathCondition);
        if (selected.size() >= Config.pathConditionCounts)
            return selected;
        if (pathConditionList.size() > Config.pathConditionCounts)
            return pathConditionList.subList(0,Config.pathConditionCounts);
        return pathConditionList;
    }

    private Double score(String token){
        String[] sp1,sp2,sp3,sp4;
        String label;
        Double score = 0.0;
        sp2 = token.split(":");
        sp3 = sp2[1].split("\\(");
        label = sp3[0].trim();
        sp3[1] = sp3[1].trim();
        sp3[1] = sp3[1].substring(0,sp3[1].length()-1);
        sp4 = sp3[1].split("/");
        if (label.equals("P")){
            score = Double.parseDouble(sp4[0]) / (Double.parseDouble(sp4[0]) + Double.parseDouble(sp4[1]));
        }else {
            score = Double.parseDouble(sp4[1]) / (Double.parseDouble(sp4[0]) + Double.parseDouble(sp4[1]));
        }
        return score;
    }
    public void drawTree(RandomTree tree) throws Exception {
        final javax.swing.JFrame jf =
                new javax.swing.JFrame("Weka Classifier Tree Visualizer: J48");
        jf.setSize(500,400);
        jf.getContentPane().setLayout(new BorderLayout());
        TreeVisualizer tv = new TreeVisualizer(null,
                tree.graph(),
                new PlaceNode2());
        jf.getContentPane().add(tv, BorderLayout.CENTER);
        jf.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                jf.dispose();
            }
        });

        jf.setVisible(true);
        tv.fitToScreen();
    }



}
