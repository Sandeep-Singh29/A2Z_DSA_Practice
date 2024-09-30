package com.practice.leetcode.linkedlist.questionleetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: SANDEEP
 * Date: 30/09/24
 */

public class ReverseLL_206 {

    private static Node reverseListBrute(Node head) { // 1 2 3 4 5
        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        Collections.reverse(list);
        for (Integer integer : list) {
            temp.val = integer;
            temp = temp.next;
        }
        return head;
    }

    private static Node reverseListUsingRecursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Recur for the rest of the list
        Node newHead = reverseListUsingRecursion(head.next);
        // Adjust the pointers
        head.next.next = head;  // Make the next node point to the current node
        head.next = null;       // Set the current node's next to null to avoid a cycle
        return newHead;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        Node.displayList(head);
//        Node node = reverseListBrute(head);
//        Node.displayList(node);
        Node node1 = reverseListUsingRecursion(head);
        Node.displayList(node1);
    }

}
