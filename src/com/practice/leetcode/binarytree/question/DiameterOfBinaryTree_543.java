package com.practice.leetcode.binarytree.question;


/**
 * Author: Sandeep Singh
 * Date: 19/06/25
 */

public class DiameterOfBinaryTree_543 {

    private static int findHeight(Node root, int[] maxi) {
        if (root == null) {
            return 0;
        }
        int leftHeight = findHeight(root.left, maxi);
        int rightHeight = findHeight(root.right, maxi);
        maxi[0] = Math.max(maxi[0], leftHeight + rightHeight);
        return (1 + Math.max(leftHeight, rightHeight));
    }

    public static int diameterOfBinaryTree(Node root) {
        int []maxi = new int[1];
        findHeight(root, maxi);
        return maxi[0];
    }



    public static void main(String[] args) {
//        int[] root = {1, 2, 3, 4, 5};
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        int diameterOfBinaryTree = diameterOfBinaryTree(root);
        System.out.println(diameterOfBinaryTree);
    }

    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

}
