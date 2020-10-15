package io.github.mhamooei;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    public static int initialAttackCounts;
    public static int blockedAttackLimit;
    public static int blockedErrorCode;
    public static int mutatedAttackCounts;
    public static int countOfAlternatives;
    public static int pathConditionCounts;
    public static int tryCount;
    public static int epochs;
    public static int treeFeatureMax;
    public static int treeFeatureMin;
    public static int treeDepth;
    public static String blockedLabel;
    public static String passedLabel;
    public static boolean randomWithProbability;
    public static boolean drawTree;
    public static int mu;
    public static int lambda;
    public static double mu_rate;
    public static int tryRate;
    public static int requestLimit;
    public static void load() throws IOException {
        InputStream inputStream = null;
        try {
            Properties properties = new Properties();
            String propFileName = "config.properties";
            inputStream = Config.class.getClassLoader().getResourceAsStream(propFileName);
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            initialAttackCounts = Integer.valueOf(properties.getProperty("initialAttackCounts"));
            blockedAttackLimit = Integer.valueOf(properties.getProperty("blockedAttackLimit"));
            blockedErrorCode = Integer.valueOf(properties.getProperty("blockedErrorCode"));
            blockedLabel = properties.getProperty("blockedLabel");
            passedLabel = properties.getProperty("passedLabel");
            randomWithProbability = Boolean.valueOf(properties.getProperty("randomWithProbability"));
            drawTree = Boolean.valueOf(properties.getProperty("drawTree"));
            mutatedAttackCounts = Integer.valueOf(properties.getProperty("mutatedAttackCounts"));
            countOfAlternatives = Integer.valueOf(properties.getProperty("countOfAlternatives"));
            pathConditionCounts = Integer.valueOf(properties.getProperty("pathConditionCounts"));
            tryCount = Integer.valueOf(properties.getProperty("tryCount"));
            epochs = Integer.valueOf(properties.getProperty("epochs"));
            treeFeatureMax = Integer.valueOf(properties.getProperty("treeFeatureMax"));
            treeFeatureMin = Integer.valueOf(properties.getProperty("treeFeatureMin"));
            treeDepth = Integer.valueOf(properties.getProperty("treeDepth"));
            mu = Integer.valueOf(properties.getProperty("mu"));
            lambda = Integer.valueOf(properties.getProperty("lambda"));
            mu_rate = Double.valueOf(properties.getProperty("mu_rate"));
            tryRate = Integer.valueOf(properties.getProperty("tryRate"));
            requestLimit = Integer.valueOf(properties.getProperty("requestLimit"));
        }catch (Exception e){
            System.out.println("Exception: " + e);
        }finally {
            if (inputStream != null)
                inputStream.close();
        }
    }
}
