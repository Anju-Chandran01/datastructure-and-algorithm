package com.bridgelabz.algorithm.bst;

public class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;
    }

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
