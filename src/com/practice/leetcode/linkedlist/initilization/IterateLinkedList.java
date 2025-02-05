package com.practice.leetcode.linkedlist.initilization;

public class IterateLinkedList {
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
        d.next = null;
        iterateLinkedList(head);
    }

    private static void iterateLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
        }
    }
}
