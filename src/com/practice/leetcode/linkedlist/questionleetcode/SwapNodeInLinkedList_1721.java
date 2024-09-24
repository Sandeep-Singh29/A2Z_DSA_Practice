package com.practice.leetcode.linkedlist.questionleetcode;

public class SwapNodeInLinkedList_1721 {

    private static Node swapNodes(Node head, int k) {
        Node temp = head;
        int temp1 = -1;
        int temp2 = -1;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                temp1 = temp.val;
            }
            temp = temp.next;
        }
        System.out.println(temp1);
        int len = count - k + 1;
        temp = head;
        for (int i = 1; i < len; i++) {
            temp = temp.next;
        }
        temp2 = temp.val;
        temp = head;
        System.out.println(temp2);
        for (int i = 1; i <= count; i++) {
            if (i == k) {
                temp.val = temp2;
            }
            if (i == len) {
                temp.val = temp1;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(7);
        Node a = new Node(9);
        Node b = new Node(6);
        Node c = new Node(6);
        Node d = new Node(7);
        Node e = new Node(8);
        Node f = new Node(3);
        Node g = new Node(0);
        Node h = new Node(1);
        Node i = new Node(5);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        Node.displayList(head);
        int k = 2;
//        Node node = swapNodes(head, k);
//        Node.displayList(node);
        Node way2 = swapNodesWay2(head, k);
        Node.displayList(way2);

    }

    private static Node swapNodesWay2(Node head, int k) {
        Node p1 = null;
        Node p2 = null;
        Node temp = head;
        while (temp != null) {
            // Move p2 after the kth node is found
            if (p2 != null) {
                p2 = p2.next;
            }
            // Decrement k until 0 to find the kth node from the start
            k--;
            if (k == 0) {
                p1 = temp;   // kth node from the start
                p2 = head;   // Start p2 from the head to find the kth node from the end
            }
            // Move temp to the next node
            temp = temp.next;
        }
        // Swap the values of p1 and p2
        int tempVal = p1.val;
        p1.val = p2.val;
        p2.val = tempVal;
        return head;
    }
}


