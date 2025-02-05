package com.practice.leetcode.linkedlist.questionleetcode;


/**
 * Author: SANDEEP
 * Date: 01/10/24
 */

public class ReverseLL2_92 {

    private static Node reverseBetween(Node head, int left, int right) {
        Node l = new Node(-1);
        Node m = new Node(-1);
        Node r = new Node(-1);
        Node copyl = l;
        Node copym = m;
        Node copyr = r;
        Node temp = head; // 1 2 3 4 5
        int i = 0;
        while (temp != null) {
            i++;
            if (i < left) {
                copyl.next = new Node(temp.val);
                copyl = copyl.next;
            } else if (i >= left && i <= right) {
                copym.next = new Node(temp.val);
                copym = copym.next;
            } else {
                copyr.next = new Node(temp.val);
                copyr = copyr.next;
            }
            temp = temp.next;
        }
        m = reverseL(m.next);
        Node tt = l;
        while (left > 0 && tt.next != null) {
            tt = tt.next;
            left--;
        }
        tt.next = m;
        while (m.next != null) {
            m = m.next;
        }
        m.next = r.next;
        return l.next;
    }

    private static Node reverseL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node a = head.next;
        Node newHead = reverseL(a);
        a.next = head;  // Make the next node point to the current node
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
        int left = 3;
        int right = 4;
        Node node = reverseBetween(head, left, right);
        Node.displayList(node);
    }
}
