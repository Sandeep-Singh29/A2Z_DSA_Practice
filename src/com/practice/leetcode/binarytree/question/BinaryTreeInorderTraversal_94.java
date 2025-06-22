package com.practice.leetcode.binarytree.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Author: Sandeep Singh
 * Date: 22/06/25
 */

public class BinaryTreeInorderTraversal_94 {

    public static List<Integer> inorderTraversal(Node root) {
        List<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while (!stack.isEmpty() || node != null) {
            // move left while not null
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                // Add element into Result
                node = stack.pop();
                res.add(node.data);
                // move right
                node = node.right;
            }
        }
        return res;
    }

    public static List<Integer> inorderTraversalWay2(Node root) {
        List<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while (!stack.isEmpty() || node != null) {
            // move left while not null
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            // Add element into Result
            node = stack.pop();
            res.add(node.data);
            // move right
            node = node.right;
        }
        return res;
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
        a.right = d;
        b.right = e;
        e.left = f;
        List<Integer> inorderTraversal = inorderTraversal(root);
        System.out.println(inorderTraversal);
        List<Integer> inorderTraversalWay2 = inorderTraversalWay2(root);
        System.out.println(inorderTraversalWay2);
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
