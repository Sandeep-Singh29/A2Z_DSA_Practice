package com.practice.leetcode.linkedlist.questionleetcode;

public class DeleteNodeLinkedList_237 {

    private static void deleteNode(Node node, int data) {
        Node temp = node;
        while (temp != null && temp.next != null) {
            if (temp.next.val == data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    private static void deleteNodeInLeetcode(Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(9);
        head.next = a;
        a.next = b;
        b.next = c;
        deleteNode(head, 5);
        Node.displayList(head);
//        deleteNodeInLeetcode(head);
        Node.displayList(head);
    }
}
