package com.clouway.intro.tree3;

/**
 * Created by clouway on 15-10-19.
 */
public class BTNode {
    BTNode left, right;

    int data;



     /* Constructor */

    public BTNode()

    {

        left = null;

        right = null;

        data = 0;

    }

     /* Constructor */

    public BTNode(int n)

    {

        left = null;

        right = null;

        data = n;

    }



    /**
     * Method to set left node
     * @param n from type BTNode
     */
    public void setLeft(BTNode n)

    {

        left = n;

    }



    /**
     * Method to set right node
     * @param n from type BTNode
     */
    public void setRight(BTNode n)

    {

        right = n;

    }



    /**
     *Method to get left node
     * @return left node
     */
    public BTNode getLeft()

    {

        return left;

    }



    /**
     * Method to get right node
     * @return right node
     */
    public BTNode getRight()

    {

        return right;

    }



    /**
     *Method to set data to node
     * @param d from type Integer
     */
    public void setData(int d)

    {

        data = d;

    }



    /**
     * Method to get data from node
     * @return
     */
    public int getData()

    {

        return data;

    }
}
