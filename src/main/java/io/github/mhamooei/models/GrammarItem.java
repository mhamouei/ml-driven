package io.github.mhamooei.models;

import io.github.mhamooei.enums.GrammarItemType;

import java.math.BigInteger;

public class GrammarItem {
    /**
     * type can be Terminal or NoneTerminal Refer to {@link GrammarItemType}
     * score is number of distinct paths through the end of syntax tree which can be reached from this NoneTerminal
     */
    private GrammarItemType type;
    private String item;
    private BigInteger score;

    public GrammarItem(GrammarItemType type, String item) {
        this.type = type;
        this.item = item;
    }

    public GrammarItemType getType() {
        return type;
    }

    public String getItem() {
        return item;
    }

    public BigInteger getScore() {
        return score;
    }

    public void setScore(BigInteger score) {
        this.score = score;
    }
}
