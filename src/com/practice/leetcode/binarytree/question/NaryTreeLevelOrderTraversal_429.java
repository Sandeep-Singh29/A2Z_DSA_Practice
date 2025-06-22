package com.practice.leetcode.binarytree.question;

import java.util.*;

/**
 * Author: Sandeep Singh
 * Date: 20/06/25
 */

public class NaryTreeLevelOrderTraversal_429 {

    public static void main(String[] args) {

        Object[] values = {1, null, 3, 2, 4, null, 5, 6};
        Node root = new Node(1);
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
// 1 -> 3, 2, 4
        root.children = Arrays.asList(a, b, c);
// 3 -> 5, 6
        a.children = Arrays.asList(d, e);
        List<List<Integer>> resultAnswer = levelOrder(root);
        System.out.println(resultAnswer);
        List<List<Integer>> levelOrderWay2 = levelOrderWay2(root);
        System.out.println(levelOrderWay2);

    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            while (size > 0) {
                Node node = queue.poll();
                level.add(node.val);
                for (Node child : node.children) {
                    if (child != null) {
                        queue.offer(child);
                    }
                }
                size--;
            }
            result.add(level);
        }
        return result;
    }

    public static List<List<Integer>> levelOrderWay2(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                level.add(node.val);
                queue.addAll(node.children);
            }
            result.add(level);
        }
        return result;
    }

    static class Node {
        int val;
        List<Node> children;

        Node(int val) {
            this.val = val;
            this.children = new ArrayList<>();
        }
    }

}
