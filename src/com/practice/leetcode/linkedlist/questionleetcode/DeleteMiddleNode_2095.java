package com.practice.leetcode.linkedlist.questionleetcode;


public class DeleteMiddleNode_2095 {

    private static Node deleteMiddle(Node head) {  // 1 3 4 7 1 2 6
        if (head == null || head.next == null) {
            return head.next;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        int size = (count / 2) - 1;
        Node temp1 = head;
        while (size > 0 && temp1 != null) {
            temp1 = temp1.next;
            size--;
        }
        temp1.next = temp1.next.next;
        return head;
    }


    public static Node deleteMiddleWay2(Node head) {
        if (head == null || head.next == null) {
            return head.next;
        }
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        Node fast = head;
        Node slow = head;
        int len = size / 2 - 1;
        for (int i = 0; i < len; i++) {
            if (i >= 0) {
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        slow.next = slow.next.next;
        return head;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(7);
        Node d = new Node(1);
        Node e = new Node(2);
        Node f = new Node(6);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node.displayList(head);
        deleteMiddle(head);
        Node.displayList(head);
//        deleteMiddleWay2(head);
//        displayList(head);
    }
}
