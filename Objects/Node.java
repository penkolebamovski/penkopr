package com.clouway.intro.tree2;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-10-18
 * Time: 19:58
 * To change this template use File | Settings | File Templates.
 */
public class Node {

    private Integer identifier;
    private ArrayList<Integer> children;

    // Constructor
    public Node(Integer identifier) {
        this.identifier = identifier;
        children = new ArrayList<Integer>();
    }

    // Properties
    public Integer getIdentifier() {
        return identifier;
    }

    public ArrayList<Integer> getChildren() {
        return children;
    }

    // Public interface
    public void addChild(Integer identifier) {
        children.add(identifier);
    }
}
