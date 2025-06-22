package com.practice.leetcode.binarytree;

/**
 * Author: Sandeep Singh
 * Date: 17/06/25
 */

public class ImplementationOfBT {

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        c.left = new Node(30);
        e.right = new Node(50);
        displayTree(a);
    }

    private static void displayTree(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        displayTree(root.left); // left child
        displayTree(root.right); // right child
    }

    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
}
