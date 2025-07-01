package com.practice.leetcode.binarytree.question;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Sandeep Singh
 * Date: 18/06/25
 */

public class MaximumDepthOfBinaryTree_104 {

    public static void main(String[] args) {
        Node root = new Node(3);
        Node a = new Node(9);
        Node b = new Node(20);
        Node e = new Node(15);
        Node f = new Node(7);
        root.left = a;
        root.right = b;
        a.left = null;
        a.right = null;
        b.left = e;
        b.right = f;
        int maxDepth = maxDepthOfNode(root);
        int usingBFS = maxDepthUsingBFS(root);
        System.out.println(maxDepth);
        System.out.println(usingBFS);
    }

    private static int maxDepthUsingBFS(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                Node peekElement = queue.poll();
                if (peekElement.left != null) {
                    queue.offer(root.left);
                }
                if (peekElement.right != null) {
                    queue.offer(peekElement.right);
                }
                size--;
            }
            if (!queue.isEmpty()) {
                level++;
            }
        }
        return (level + 1);
    }

    private static int maxDepthOfNode(Node root) {
        if (root == null) return 0;
        int left = maxDepthOfNode(root.left);
        int right = maxDepthOfNode(root.right);
        return 1 + Math.max(left, right);
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
