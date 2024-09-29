package com.practice.leetcode.linkedlist.questionleetcode;

/**
 * Author: SANDEEP
 * Date: 27-09-2024
 */

public class RotateList_61 {
    // 1 2 3 4 5
    private static Node rotateRight(Node head, int k) {
        if (k == 0 || head == null || head.next == null) return head;
        if (head == null) return head;
        Node tmp = head;
        int count = 0;
        while (tmp != null) {
            tmp = tmp.next;
            count++;
        }
        k = k % count;
        if (k == 0) return head;
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        Node newHead = slow.next; // new Node banaya aur slow ka next ko assign kiya
        slow.next = null; // slow ka next ko null kar diya
        fast.next = head; //last main fast ka next ho head sa connect kar diya
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
        int k = 2;
        Node node = rotateRight(head, k);
        Node.displayList(node);
    }

}