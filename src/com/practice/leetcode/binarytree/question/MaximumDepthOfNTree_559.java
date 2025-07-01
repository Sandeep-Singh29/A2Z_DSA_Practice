package com.practice.leetcode.binarytree.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 25/06/25
 */

public class MaximumDepthOfNTree_559 {

    public static int maxDepth(Node root) {
        if(root==null){
            return 0;
        }

        return 0;
    }

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
        int maxDepth = maxDepth(root);
        System.out.println(maxDepth);
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
