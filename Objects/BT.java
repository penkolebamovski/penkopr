package com.clouway.intro.tree3;

/**
 * Created by clouway on 15-10-19.
 */
public class BT {
    private BTNode root;



     /* Constructor */

    public BT()

    {

        root = null;

    }


    /**
     * Method who check if tree is empty or not
     * @return true or false
     */
    public boolean isEmpty()

    {

        return root == null;

    }



    /**
     * Method who is insert data
     * @param data from type Integer
     */
    public void insert(int data)

    {

        root = insert(root, data);

    }



    /**
     * Method to insert data recursively
     * @param node is from type BTNode
     * @param data is from type Integer
     * @return variable node
     */
    private BTNode insert(BTNode node, int data)

    {

        if (node == null)

            node = new BTNode(data);

        else

        {

            if (node.getRight() == null)

                node.right = insert(node.right, data);

            else

                node.left = insert(node.left, data);

        }

        return node;

    }



    /**
     * Method to count number of nodes
     * @return number of nodes
     */
    public int countNodes()

    {

        return countNodes(root);

    }



    /**
     * Method  to count number of nodes recursively
     * @param r is from type BTNode
     * @return number of nodes
     */
    private int countNodes(BTNode r)

    {

        if (r == null)

            return 0;

        else

        {

            int l = 1;

            l += countNodes(r.getLeft());

            l += countNodes(r.getRight());

            return l;

        }

    }



    /**
     * Method to search for an element
     * @param val is from type Integer
     * @return
     */
    public boolean search(int val)

    {

        return search(root, val);

    }



    /**
     * Method to search for an element recursively
     * @param r is from type BTNode
     * @param val is from type Integer
     * @return two options true or false
     */
    private boolean search(BTNode r, int val)

    {

        if (r.getData() == val)

            return true;

        if (r.getLeft() != null)

            if (search(r.getLeft(), val))

                return true;

        if (r.getRight() != null)

            if (search(r.getRight(), val))

                return true;

        return false;

    }



    /**
     *Method for inorder traversal
     */
    public void inorder()

    {

        inorder(root);

    }

    private void inorder(BTNode r)

    {

        if (r != null)

        {

            inorder(r.getLeft());

            System.out.print(r.getData() +" ");

            inorder(r.getRight());

        }

    }



    /**
     *Method for preorder traversal
     */
    public void preorder()

    {

        preorder(root);

    }

    private void preorder(BTNode r)

    {

        if (r != null)

        {

            System.out.print(r.getData() +" ");

            preorder(r.getLeft());

            preorder(r.getRight());

        }

    }

    /**
     * Method for postorder traversal
     */
    public void postorder()

    {

        postorder(root);

    }

    private void postorder(BTNode r)

    {

        if (r != null)

        {

            postorder(r.getLeft());

            postorder(r.getRight());

            System.out.print(r.getData() +" ");

        }

    }
}
