package com.clouway.intro.tree2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-10-18
 * Time: 19:36
 * To change this template use File | Settings | File Templates.
 */

    public class Tree {

        private final static int ROOT = 0;

        private HashMap<Integer,Node> nodes;
        private TraversalStrategy traversalStrategy;

        // Constructors
        public Tree() {
            this(TraversalStrategy.DEPTH_FIRST);
        }

        public Tree(TraversalStrategy traversalStrategy) {
            this.nodes = new HashMap<Integer, Node>();
            this.traversalStrategy = traversalStrategy;
        }

        // Properties
        public HashMap<Integer, Node> getNodes() {
            return nodes;
        }

        public TraversalStrategy getTraversalStrategy() {
            return traversalStrategy;
        }

        public void setTraversalStrategy(TraversalStrategy traversalStrategy) {
            this.traversalStrategy = traversalStrategy;
        }

        // Public interface
        public Node addNode(Integer identifier) {
            return this.addNode(identifier, null);
        }

    /**
     * Method add nodes
     * @param identifier is from Integer
     * @param parent is from Integer
     * @return node
     */
    public Node addNode(Integer identifier, Integer parent) {
            Node node = new Node(identifier);
            nodes.put(identifier, node);

            if (parent != null) {
                nodes.get(parent).addChild(identifier);
            }

            return node;
        }

        public void display(Integer identifier) {
            this.display(identifier, ROOT);
        }

    /**
     * Method  shows the tree screen
     * @param identifier is from Integer
     * @param depth is from int
     */
    public void display(Integer identifier, int depth) {
            ArrayList<Integer> children = nodes.get(identifier).getChildren();

            if (depth == ROOT) {
                System.out.println(nodes.get(identifier).getIdentifier());
            } else {
                String tabs = String.format("%0" + depth + "d", 0).replace("0", "    "); // 4 spaces
                System.out.println(tabs + nodes.get(identifier).getIdentifier());
            }
            depth++;
            for (Integer child : children) {

                // Recursive call
                this.display(child, depth);
            }
        }

        public Iterator<Node> iterator(Integer identifier) {
            return this.iterator(identifier, traversalStrategy);
        }

    /**
     * Method crawls the tree
     * @param identifier is from Integer
     * @param traversalStrategy is from type TraversalStrategy
     * @return the tidy tree
     */
    public Iterator<Node> iterator(Integer identifier, TraversalStrategy traversalStrategy) {
            return traversalStrategy == TraversalStrategy.BREADTH_FIRST ?
                    new BreadthFirstTreeIterator(nodes, identifier) :
                    new DepthFirstTreeIterator(nodes, identifier);
        }
    }




