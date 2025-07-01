package com.practice.leetcode.binarytree.question;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 23/06/25
 */

public class ConstructBTFromPostOrderAndInOrderTraversal_106 {


    public static void main(String[] args) {
        int[] postOrder = {9, 15, 7, 20, 3};
        int[] inorder = {9, 3, 15, 20, 7};
        Node root = buildTreePoIo(postOrder, inorder);
        System.out.println(root);
    }

    static Map<Integer, Integer> mapInOrder = new HashMap<>();
    public static Node buildTreePoIo(int[] inorder, int[] postorder) {
        int n = postorder.length;
        for (int i = 0; i < n; i++) {
            mapInOrder.put(inorder[i], i);
        }
        return buildBT(inorder, postorder, 0, n - 1, 0, n - 1);
    }

    private static Node buildBT(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }
        Node root = new Node(postorder[postEnd]);
        int rootVal = root.data;
        int i = mapInOrder.get(rootVal);
        int leftSize = i - inStart;
        int rightSize = inEnd - i;
        root.left = buildBT(inorder, postorder, inStart, i - 1, postStart, postStart + leftSize - 1);
        root.right = buildBT(inorder, postorder, i + 1, inEnd, postEnd - rightSize, postEnd - 1);
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
