package io.github.mhamooei.models;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Slice {
    /**
     * Tree is string of sub tree
     * Parent is smallest bigger slice, containing this slice
     * OutPut is a string which is generated with this slice
     */
    private String tree;
    private String parent;
    private String outPut;
    public static List<String> slices = new ArrayList<>();
    public static int lastSlice = 0;

    public Slice(String tree, String parent, String outPut) {
        this.tree = tree;
        this.parent = parent;
        this.outPut = outPut;
    }

    public String getTree() {
        return tree;
    }

    public String getParent() {
        return parent;
    }

    public String getOutPut() {
        return outPut;
    }
}
