package com.clouway.intro.tree2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-10-18
 * Time: 20:02
 * To change this template use File | Settings | File Templates.
 */
public class BreadthFirstTreeIterator implements Iterator<Node> {
    private static final int ROOT = 0;


        private LinkedList<Node> list;
        private HashMap<Integer, ArrayList<Integer>> levels;

        public BreadthFirstTreeIterator(HashMap <Integer, Node> tree, Integer identifier) {
            list = new LinkedList<Node>();
            levels = new HashMap<Integer, ArrayList<Integer>>();

            if (tree.containsKey(identifier)) {
                this.buildList(tree, identifier, ROOT);

                for (Map.Entry<Integer, ArrayList<Integer>> entry : levels.entrySet()) {
                    for (Integer child : entry.getValue()) {
                        list.add(tree.get(child));
                    }
                }
            }
        }

    /**
     * Method built tree
     * @param tree is implement by HashMap by key Integer and value Node
     * @param identifier is from type Integer
     * @param level is from type int
     */
    private void buildList(HashMap<Integer, Node> tree, Integer identifier, int level) {
            if (level == ROOT) {
                list.add(tree.get(identifier));
            }

            ArrayList<Integer> children = tree.get(identifier).getChildren();

            if (!levels.containsKey(level)) {
                levels.put(level, new ArrayList<Integer>());
            }
            for (Integer child : children) {
                levels.get(level).add(child);

                // Recursive call
                this.buildList(tree, child, level + 1);
            }
        }

        @Override
        public boolean hasNext() {
            return !list.isEmpty();
        }

        @Override
        public Node next() {
            return list.poll();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

