package com.practice.leetcode.linkedlist.questionleetcode;

/**
 * Author: SANDEEP
 * Date: 01-10-2024
 */

public class ReorderList_143 {
    private static void reorderList(Node head) {
        Node slow = head;
        Node fast = head;
        int count = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        fast = head;
        slow = reverseLL(slow);
        Node dummy = new Node(-1);
        Node copy = dummy;
        for (int i = 0; i < count; i++) {
            int left = fast.val;
            int right = slow.val;
            copy.next = new Node(left);
            copy = copy.next;
            copy.next = new Node(right);
            copy = copy.next;
            fast = fast.next;
            slow = slow.next;
        }
        copy.next = new Node(fast.val);
        Node temp = dummy.next;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    private static Node reverseLL(Node next) {
        Node previous = null;
        Node current = next;
        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }

    public static void main(String[] args) { // 1 2 3 4  // 1 2 3 4 5
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
//        Node d = new Node(5);
        head.next = a;
        a.next = b;
        b.next = c;
//        c.next = d;
        Node.displayList(head);
        reorderList(head);
    }

}