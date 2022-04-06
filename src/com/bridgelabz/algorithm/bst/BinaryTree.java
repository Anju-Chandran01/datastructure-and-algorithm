package com.bridgelabz.algorithm.bst;

//class for the creating node in the linked list
class Node{
    int data;
    Node left;
    Node right;
}

public class BinaryTree {

    //method to insert child node in BSt
    public Node insert(Node root, int val) {
        if (root == null) {
            return craeteNewNode(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        }
        else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    //method to create new node in BST
    public Node craeteNewNode(int k) {
        Node bst = new Node();
        bst.data = k;
        bst.left = null;
        bst.right = null;
        return bst;
    }

    /*Search particular node is present or not
     if present return true
     else return false
     */
    public boolean nodePresent(Node root, int val) {
        if (root == null) {
            return false;
        }
        Boolean isPresent = false;

        while (root != null) {
            if(val < root.data) {
                root = root.left;
            }
            else if(val > root.data) {
                root = root.right;
            }
            else {
                isPresent = true;
                System.out.println("Node is Present");
                break;
            }
        }
        return isPresent;
    }


    //method to print node
    public void print(Node root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }
}
