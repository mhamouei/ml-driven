package io.github.mhamooei;

import io.github.mhamooei.attack.AttackExe;
import io.github.mhamooei.machinelearning.MlAttackGenerator;
import io.github.mhamooei.attack.RandomGenerator;
import io.github.mhamooei.machinelearning.Data;
import io.github.mhamooei.machinelearning.DecisionTree;
import io.github.mhamooei.machinelearning.Slicer;
import io.github.mhamooei.models.Attack;
import io.github.mhamooei.models.PathCondition;
import me.tongfei.progressbar.ProgressBar;
import weka.classifiers.trees.RandomTree;
import weka.core.Instances;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static List<Attack> attacks = new ArrayList<>();
    public static ArrayList<Attack> trainData = new ArrayList<>();
    public static int total_pass = 0;
    public static int currentEpoch = 0;
    public static int newlyBypassed = 0;
    public static int total_requests = 0;
    public static long startTime = 0;
    public static int test_number = 1;
    public static boolean early_stop = false;
    public static ArrayList<Integer> bypassing = new ArrayList<>();
    public static ArrayList<Long> Runtime = new ArrayList<>();
    public static void main(String [] args) throws Exception {
        for (int test = 7; test < 10; test++) {
            attacks = new ArrayList<>();
            trainData = new ArrayList<>();
            total_pass = 0;
            currentEpoch = 0;
            newlyBypassed = 0;
            total_requests = 0;
            startTime = 0;
            early_stop = false;
            test_number = 1 + test;
            bypassing = new ArrayList<>();
            Config.load();
            Attack.buildGenerationDictionary();
            startTime = System.nanoTime();
            RandomGenerator randomGenerator = new RandomGenerator();
            AttackExe attackExe = new AttackExe();
            Slicer slicer = new Slicer();
            Data data = new Data();
            DecisionTree decisionTree = new DecisionTree();
            MlAttackGenerator mlAttackGenerator = new MlAttackGenerator();
            currentEpoch = 1;
            List<Attack> newAttacks;
            newAttacks = attackExe.executeAttacks(randomGenerator.generate());

            data.prepareData(newAttacks);
            slicer.slice();
            Instances instances = data.buildDataSet();
            RandomTree randomTree = decisionTree.build(instances);
            List<PathCondition> pathConditions = decisionTree.getPathConditions(randomTree);

            if (Config.drawTree)
                decisionTree.drawTree(randomTree);
            for (int i = 1; i <= Config.epochs; i++) {
                currentEpoch = i + 1;
                int newAttacksSize = 0;
                int zeroCount = 0;
                int prevNewlyBypassed = newlyBypassed;
                try (ProgressBar pb = new ProgressBar("Mutate Attacks", Config.mutatedAttackCounts)) {
                    while (newAttacksSize < Config.mutatedAttackCounts) {
                        if (early_stop)
                            break;
                        List<Attack> chosen = mlAttackGenerator.chooseAttack(pathConditions);
                        List<String> mutated = mlAttackGenerator.mutateAttacks(chosen);
                        pb.stepBy(mutated.size());
                        newAttacksSize += mutated.size();
                        if  (mutated.size() == 0){
                            zeroCount ++;
                        }
                        if (zeroCount == 3)
                            break;
                        data.clearTrainData();
                        //System.out.println(newAttacksSize + "/" + Config.mutatedAttackCounts);

                        newAttacks = attackExe.executeAttacks(mutated);

                        data.prepareData(newAttacks);                        slicer.slice();

                    }
                }
                System.out.println("epoch: " + i + "/" + Config.epochs + " done and " + total_pass + " totally passed");

                if (i == Config.epochs || early_stop)
                    break;
                //if (currentEpoch < 10) {
                newlyBypassed = 0;
                data.clearTrainData();
                data.prepareData(newAttacks);
                slicer.resetSlices();
                instances = data.buildDataSet();
                randomTree = decisionTree.build(instances);
                pathConditions = decisionTree.getPathConditions(randomTree);
                if (Config.drawTree)
                    decisionTree.drawTree(randomTree);
                //}

            }
            long endTime = System.nanoTime();
            long duration = (endTime - startTime)  / 1000000;
            int totalSuccess = 0;
            for (Attack attack : attacks)
                if (attack.getLabel().equals(Config.passedLabel)){
                    totalSuccess ++;
                    //System.out.println(attack.getAttack());
                }

            System.out.println("Total Success: " + totalSuccess);
            System.out.println("Execution Time: " + duration + "ms");

            if(!early_stop) {
                Runtime.add(duration);
                File csvFile = new File("out\\output_" + test_number + ".csv");
                try (PrintWriter csvWriter = new PrintWriter(new FileWriter(csvFile))) {
                    for (Integer item : bypassing) {
                        csvWriter.println(item + ",");
                    }
                } catch (IOException e) {
                    //Handle exception
                    e.printStackTrace();
                }
                csvFile = new File("out\\time.csv");
                try (PrintWriter csvWriter = new PrintWriter(new FileWriter(csvFile))){
                    for(Long item : Main.Runtime){
                        csvWriter.println(item+",");
                    }
                } catch (IOException e) {
                    //Handle exception
                    e.printStackTrace();
                }
            }
        }

    }

}
