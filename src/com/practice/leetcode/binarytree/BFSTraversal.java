package com.practice.leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Sandeep Singh
 * Date: 19/06/25
 */

public class BFSTraversal {

    public static void main(String[] args) {

        Node<Integer> root = new Node<>(20);
        Node<Integer> a = new Node<>(5);
        Node<Integer> b = new Node<>(7);
        Node<Integer> c = new Node<>(9);
        Node<Integer> d = new Node<>(8);
        Node<Integer> e = new Node<>(10);
        Node<Integer> f = new Node<>(15);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        d.left = f;
        b.right = e;
        ArrayList<Integer> integers = BFSAlgorithm(root);
        System.out.println(integers);

    }

    public static ArrayList<Integer> BFSAlgorithm(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node<Integer> processNode = queue.poll();
            result.add(processNode.data);
            if (processNode.left != null) {
                queue.offer(processNode.left);
            }
            if (processNode.right != null) {
                queue.offer(processNode.right);
            }
        }
        return result;
    }

    static class Node<E> {
        Node<E> left;
        Node<E> right;
        E data;
        public Node(E data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }

}
