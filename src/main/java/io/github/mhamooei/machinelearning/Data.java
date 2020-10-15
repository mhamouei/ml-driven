package io.github.mhamooei.machinelearning;

import io.github.mhamooei.Config;
import io.github.mhamooei.Main;
import io.github.mhamooei.models.Attack;
import io.github.mhamooei.models.Slice;
import io.github.mhamooei.utils.AttackCollection;
import me.tongfei.progressbar.ProgressBar;
import weka.core.*;
import weka.core.converters.CSVLoader;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class Data {
    private static List<Instance> instances;
    private static List<Thread> threads;
    public void prepareData(List<Attack> attacks) {

        //Main.trainData.addAll(attacks);
        for (Attack attack : attacks)
            if (attack.getLabel().equals(Config.passedLabel)) {
                Main.trainData.add(attack);
                //Main.attacks.add(attack);
            } else
                Main.attacks.add(attack);
        Collections.shuffle(Main.attacks);
        int blockedCount = 0;
        for (Attack attack : Main.trainData) {
            if (attack.getLabel().equals(Config.blockedLabel))
                blockedCount++;
        }
        int randomBlockedAttackCount = Config.blockedAttackLimit - blockedCount;
        if (Main.attacks.size() > Config.initialAttackCounts) {
            for (Attack attack : Main.attacks) {
                if (attack.getLabel().equals(Config.passedLabel))
                    Main.trainData.add(attack);
                else if (randomBlockedAttackCount > 0) {
                    Main.trainData.add(attack);
                    randomBlockedAttackCount--;
                }
            }
        }else
        {
            Main.trainData.addAll(Main.attacks);
        }
        for (Attack attack : attacks)
            if (attack.getLabel().equals(Config.passedLabel)) {
                Main.attacks.add(attack);
            }
        //Main.attacks.addAll(attacks);
    }
    public void addData(List<Attack> attacks){

        Main.trainData.addAll(attacks);
        Main.attacks.addAll(attacks);
    }
    public void clearTrainData(){
        Main.trainData.clear();
    }
    public Instances buildDataSet() throws InterruptedException {
        Slice.slices = new ArrayList<>();
        for (Attack attack: Main.trainData) {
            List<String> slices = attack.getSlices();
            Collections.shuffle(slices);
            int added = 0;
            for (String s:slices) {
                if (!Slice.slices.contains(s) && added < 1){
                    Slice.slices.add(s);
                    added++;
                }else if (added == 1)
                    break;
            }
        }
        int dim = Slice.slices.size();
        int dataSize = Main.trainData.size();
        ArrayList<Attribute> attributes = new ArrayList<>();
        instances = new ArrayList<>();
        for (int i = 0; i< dim; i++){
            attributes.add(new Attribute("S"+i,i));
        }

        ArrayList<String> labels = new ArrayList<>();
        labels.add("unspecified");
        labels.add(Config.blockedLabel);
        labels.add(Config.passedLabel);
        Attribute classLabel = new Attribute("class", labels);

        attributes.add(classLabel);
        for(int obj = 0; obj < dataSize; obj++)
        {
            instances.add(new DenseInstance(dim + 1));
        }
        /*try (ProgressBar pb = new ProgressBar("Building DataSet", dataSize)) {
            for (int j = 0; j < dataSize; j++) {
                //System.out.println(j);
                pb.step();
                for (int k = 0; k <= dim; k++) {
                    if (k == Slice.slices.size()) {
                        if (Main.trainData.get(j).getLabel().equals(Config.passedLabel))
                            instances.get(j).setValue(k, 2.0);
                        else
                            instances.get(j).setValue(k, 1.0);
                    } else if (Main.trainData.get(j).getSlices().contains(Slice.slices.get(k)))
                        instances.get(j).setValue(k, 1.0);
                    else
                        instances.get(j).setValue(k, 0.0);

                }
            }
        }*/
       // for (Attack attack : Main.trainData)
           // if (attack.getLabel().equals(Config.passedLabel))
               // System.out.println(attack.getAttack());

        threads = new ArrayList<>();
        /*
        for(int i=0; i< dataSize-1000; i+= 1000)
            background(i, i + 999);
       // if (dataSize%1000 > 0){
            int s = dataSize / 1000;
            background(s*1000, dataSize - 1);
       // }

         */
        background(0, dataSize - 1);
        for (Thread thread : threads)
            thread.start();
        //try (ProgressBar pb = new ProgressBar("Building DataSet", threads.size())) {
            for (Thread thread : threads) {
                thread.join();
                //pb.step();
            }
        //}

        Instances dataRaw = new Instances("TestInstances", attributes , dataSize);
        dataRaw.setClassIndex(dataRaw.numAttributes() - 1);
        dataRaw.addAll(instances);
        //String data = dataRaw.toString();
        //System.out.println(dataRaw);
        return dataRaw;
        //System.out.println(data);
    }
    void background(int startIndex, int endIndex) {
        class Task implements Runnable {
            private int start, end;
            private int dim = Slice.slices.size();
            private Task(int startIndex, int endIndex) {
                this.start = startIndex;
                this.end = endIndex;
            }
            public void run() {
                try (ProgressBar pb = new ProgressBar("Building DataSet", endIndex - startIndex + 1)) {
                    for (int j = start; j <= end; j++) {
                        //System.out.println(j);

                        for (int k = 0; k <= dim; k++) {
                            if (k == Slice.slices.size()) {
                                if (Main.trainData.get(j).getLabel().equals(Config.passedLabel))
                                    instances.get(j).setValue(k, 2.0);
                                else
                                    instances.get(j).setValue(k, 1.0);
                            } else if (Main.trainData.get(j).getSlices().contains(Slice.slices.get(k)))
                                instances.get(j).setValue(k, 1.0);
                            else
                                instances.get(j).setValue(k, 0.0);

                        }
                        pb.step();
                    }
                }
            }
        }
        Thread t = new Thread(new Task(startIndex, endIndex));
        threads.add(t);
        //t.start();
    }
    public void awaitTerminationAfterShutdown(ExecutorService threadPool) {
        threadPool.shutdown();
        try {
            if (!threadPool.awaitTermination(60, TimeUnit.SECONDS)) {
                threadPool.shutdownNow();
            }
        } catch (InterruptedException ex) {
            threadPool.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
