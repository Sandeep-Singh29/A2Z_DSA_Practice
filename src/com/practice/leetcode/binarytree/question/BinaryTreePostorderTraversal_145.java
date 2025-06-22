package com.practice.leetcode.binarytree.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Author: Sandeep Singh
 * Date: 22/06/25
 */

public class BinaryTreePostorderTraversal_145 {

    public static List<Integer> postorderTraversal(Node root) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while (node != null || !stack.isEmpty()) {
            // move left while not null
            if (node != null) {
                stack.push(node);
                node = node.left;
                // move right while not null
            } else if (stack.peek().right != null) {
                node = stack.peek().right;
            } else {
                Node temp = stack.pop();
                // add element into result
                result.add(temp.data);
                // Backtrack aur root process (jab right complete ho gaya ho)
                while (!stack.isEmpty() && temp == stack.peek().right) {
                    temp = stack.pop();
                    result.add(temp.data);
                }
            }
        }
        return result;
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
        List<Integer> inorderTraversal = postorderTraversal(root);
        System.out.println(inorderTraversal);
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
