package com.bridgelabz.algorithm.bst;

public class MainTree {
    public static void main(String[] args) {

        //creating instances
        BinaryTree bst = new BinaryTree();
        BinaryTree.Node root = null;

		/*Inserting node in the Binary tree
			56 -> root nood
			30 -> left node
			70 -> right node	*/
        root = bst.insert(root, 56);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);
        root = bst.insert(root, 46);

        bst.print(root);
    }
}
