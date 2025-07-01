package com.practice.leetcode.binarytree.question;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 23/06/25
 */

public class ConstructBTFromPreOrderAndInOrderTraversal_105 {


    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        Node root = buildTree(preorder, inorder);
        System.out.println(root);
    }

    private static final Map<Integer, Integer> inorderMap = new HashMap<>();
    public static Node buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        for (int i = 0; i < n; i++) {
            inorderMap.put(inorder[i], i);
        }
        int[] index = {0}; // Using array to pass by reference
        return construct(preorder, inorder, 0, n - 1, index);
    }

    private static Node construct(int[] preorder, int[] inorder, int left, int right, int[] index) {
        if (left > right) {
            return null;
        }
        int rootVal = preorder[index[0]];
        index[0]++;
        int i = inorderMap.get(rootVal);
        Node root = new Node(rootVal);
        root.left = construct(preorder, inorder, left, i - 1, index);
        root.right = construct(preorder, inorder, i + 1, right, index);
        return root;
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
