package io.github.mhamooei.models;

public class PathCondition {
    private String[] path;
    private Double score;

    public PathCondition(String[] path, Double score) {
        this.path = path;
        this.score = score;
    }

    public String[] getPath() {
        return path;
    }

    public Double getScore() {
        return score;
    }
}
