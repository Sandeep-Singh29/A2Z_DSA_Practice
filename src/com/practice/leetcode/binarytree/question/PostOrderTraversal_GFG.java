package com.practice.leetcode.binarytree.question;

import java.util.ArrayList;

/**
 * Author: Sandeep Singh
 * Date: 21/06/25
 */

public class PostOrderTraversal_GFG {

    static ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        postOrderTraversal(root, res);
        return res;
    }
    private static void postOrderTraversal(Node root, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left, res);
        postOrderTraversal(root.right, res);
        res.add(root.data);
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
        ArrayList<Integer> postOrdered = postOrder(root);
        System.out.println(postOrdered);
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
