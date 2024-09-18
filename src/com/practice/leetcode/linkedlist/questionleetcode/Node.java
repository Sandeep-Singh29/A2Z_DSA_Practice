package com.practice.leetcode.linkedlist.questionleetcode;

public class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
    }

    protected static void displayList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}


