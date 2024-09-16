package com.practice.leetcode.linkedlist.initilization;

public class IterateUsingRecursion {
    static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        Node temp = head;
        iterateUsingRecusion(temp);

    }

    private static void iterateUsingRecusion(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        iterateUsingRecusion(head.next);

    }
}
