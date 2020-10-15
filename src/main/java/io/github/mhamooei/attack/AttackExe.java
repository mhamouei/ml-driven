package io.github.mhamooei.attack;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import io.github.mhamooei.Config;
import io.github.mhamooei.Main;
import io.github.mhamooei.models.Attack;
import me.tongfei.progressbar.ProgressBar;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttackExe {
    public List<Attack> executeAttacks(List<String> tests){
        List<Attack> newAttacks = new ArrayList<>();
        int success = 0;
        try (ProgressBar pb = new ProgressBar("Running Attacks", tests.size())) {
            for (String test : tests) {
                try {
                    Map<String, String> headers = new HashMap<>();
                    headers.put("Cookie", "pid="+test);
                    HttpResponse response = Unirest.get("http://192.168.56.102")
                            //.headers(headers)
                            .queryString("q", test)
                            .asString();
                    Main.total_requests ++;
                    if (response.getStatus() != Config.blockedErrorCode) {
                        success ++;
                        Main.total_pass ++;
                        Main.newlyBypassed ++;

                        newAttacks.add(new Attack(test, Config.passedLabel));
                    } else {

                        newAttacks.add(new Attack(test, Config.blockedLabel));
                    }
                    Main.bypassing.add(Main.total_pass);
                    pb.step();
                    pb.setExtraMessage(success+"Pass");

                } catch (UnirestException e) {
                    e.printStackTrace();
                }
                if (Main.total_requests == Config.requestLimit) {
                    earlyStopping();
                    return newAttacks;
                }
            }
        }
        return newAttacks;
    }
    public void earlyStopping(){
        long endTime = System.nanoTime();
        long duration = (endTime - Main.startTime)  / 1000000;
        int totalSuccess = 0;
        for (Attack attack : Main.attacks)
            if (attack.getLabel().equals(Config.passedLabel)){
                totalSuccess ++;
                System.out.println(attack.getAttack());
            }

        System.out.println("Total Success: " + totalSuccess);
        System.out.println("Execution Time: " + duration + "ms");
        Main.Runtime.add(duration);
        File csvFile = new File("out\\output_"+Main.test_number+".csv");
        try (PrintWriter csvWriter = new PrintWriter(new FileWriter(csvFile))){
            for(Integer item : Main.bypassing){
                csvWriter.println(item+",");
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
        Main.early_stop = true;
        //System.exit(0);
    }
}
