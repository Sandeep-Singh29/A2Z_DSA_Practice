package com.practice.leetcode.binarytree.question;

import java.util.ArrayList;

/**
 * Author: Sandeep Singh
 * Date: 21/06/25
 */

public class PreOrderTraversal_GFG {

    static ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        preOrderTraversal(root, res);
        return res;
    }
    private static void preOrderTraversal(Node root, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.data);
        preOrderTraversal(root.left, res);
        preOrderTraversal(root.right, res);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        root.left = a;
        root.right = b;
        a.left = c;
        b.left = d;
        d.right = e;
        e.left = f;
        ArrayList<Integer> preOrdered = preorder(root);
        System.out.println(preOrdered);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
