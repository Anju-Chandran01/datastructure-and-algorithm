package com.bridgelabz.algorithm.bst;

import java.util.Scanner;

public class MainTree {
    public static void main(String[] args) {
        //creating instances
        BinaryTree bst = new BinaryTree();
        Node root = null;
        /*Inserting node in the Binary tree*/

        root = bst.insert(root, 56);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);
        root = bst.insert(root, 22);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 95);
        root = bst.insert(root, 11);
        root = bst.insert(root, 65);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 63);
        root = bst.insert(root, 67);
        bst.print(root);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the node you want to search");
        int search =sc.nextInt();
        System.out.println(bst.nodePresent(root, search));

    }
}
