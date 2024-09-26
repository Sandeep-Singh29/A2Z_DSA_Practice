package com.practice.leetcode.linkedlist.questionleetcode;

import java.util.HashSet;

public class LinkedListCycle_141 {

    private static boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        Node a = new Node(2);
        Node b = new Node(0);
        Node c = new Node(-4);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = a;
//        Node.displayList(head);
//        boolean cycle = hasCycle(head);
        boolean usingHash = hasCycleUsingHash(head);
//        System.out.println(cycle);
        System.out.println(usingHash);
    }

    private static boolean hasCycleUsingHash(Node head) {
            HashSet<Node> visited = new HashSet<>();
            Node current = head;
            while (current != null) {
                if (visited.contains(current)) return true;
                visited.add(current);
                current = current.next;
            }
            return false;
        }
    }

