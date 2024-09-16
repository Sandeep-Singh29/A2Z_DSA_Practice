package com.practice.leetcode.linkedlist.initilization;


public class LinkedListInitilized {

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
        System.out.println("head value : " + head.val);
        System.out.println("a value : " + a.val);
        System.out.println("b value : " + b.val);
        System.out.println("c value : " + c.val);
        System.out.println("d value : " + d.val);

        // Connect to Each other and assign the address in next
        System.out.println("After assigning the address in next to each Node");
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        System.out.println("head value : " + head.val);
        System.out.println("a : " + head.next.val);
        System.out.println("b : " + head.next.next.val);
        System.out.println("c : " + head.next.next.next.val);
        System.out.println("d : " + head.next.next.next.next.val);
    }
}
