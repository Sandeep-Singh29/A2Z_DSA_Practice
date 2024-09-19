package com.practice.leetcode.linkedlist.questionleetcode;

public class MiddleLinkedList_876 {

    public static Node middleNode(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int size = 0;
        if (count % 2 != 0) {
            size = count / 2;
        } else {
            size = (count / 2);
        }
        temp = head;
        int i = 0;
        while (temp != null) {
            if (i >= size) {
                return temp;
            }
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public static Node middleNodeWay2(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        int size = count / 2;
        for (int i = 0; i < size; i++) {
            temp = temp.next;
        }
        return temp;
    }

    private static Node middleNodeWay3(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        Node.displayList(head);
//        Node node = middleNode(head);
//        Node.displayList(node);
//        Node node1 = middleNodeWay2(head);
//        Node.displayList(node1);
        Node node2 = middleNodeWay3(head);
        Node.displayList(node2);

    }
}
