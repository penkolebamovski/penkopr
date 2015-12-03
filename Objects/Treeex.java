package com.clouway.intro.tree2;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-10-18
 * Time: 19:37
 * To change this template use File | Settings | File Templates.
 */
public class Treeex {

    public static void main(String[] args) {
        Tree tree = new Tree();

        /*
         * The second parameter for the addNode method is the identifier
         * for the node's parent. In the case of the root node, either
         * null is provided or no second parameter is provided.
         */
        tree.addNode(1);
        tree.addNode(2, 1);
        tree.addNode(10, 1);
        tree.addNode(3, 2);
        tree.addNode(4, 2);
        tree.addNode(12, 4);
        tree.addNode(8, 4);
        tree.addNode(6, 12);
        tree.addNode(7, 6);
        tree.addNode(11, 10);
        tree.addNode(9, 2);

        tree.display(1);

        System.out.println("\n***** DEPTH-FIRST ITERATION *****");

        // Default traversal strategy is 'depth-first'
        Iterator<Node> depthIterator = tree.iterator(1);

        while (depthIterator.hasNext()) {
            Node node = depthIterator.next();
            System.out.println(node.getIdentifier());
        }

        System.out.println("\n***** BREADTH-FIRST ITERATION *****");

        Iterator<Node> breadthIterator = tree.iterator(1, TraversalStrategy.BREADTH_FIRST);

        while (breadthIterator.hasNext()) {
            Node node = breadthIterator.next();
            System.out.println(node.getIdentifier());
        }
    }
}
