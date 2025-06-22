package com.practice.leetcode.binarytree.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Author: Sandeep Singh
 * Date: 21/06/25
 */

public class BinaryTreePreorderTraversal_144 {

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
        List<Integer> usingRecursion = preorderTraversal(root);
        System.out.println(usingRecursion);
        List<Integer> usingIterative = preorderTraversalUsingIterative(root);
        System.out.println(usingIterative);

    }

    private static List<Integer> preorderTraversalUsingIterative(Node root) {
        List<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if (root == null) return res;
        stack.push(root);
        while (!stack.isEmpty()) {
            Node peekElement = stack.pop();
            res.add(peekElement.data);
            if (peekElement.right != null) {
                stack.push(peekElement.right);
            }
            if (peekElement.left != null) {
                stack.push(peekElement.left);
            }
        }
        return res;
    }

    private static List<Integer> preorderTraversal(Node root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root, res);
        return res;
    }

    private static void preOrder(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.data);
        preOrder(root.left, res);
        preOrder(root.right, res);
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
