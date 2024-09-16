package com.practice.leetcode.linkedlist.questionleetcode;


public class ArrayToLinkedListGFG {

    static class Node{
        Node next;
        int val;
        Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5};
       Node head =  arrayToLinkedList(arr);
       displayLL(head);
    }

    private static void displayLL(Node head) {
        Node temp  = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    private static Node arrayToLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        for(int i=1; i< arr.length; i++){
            Node curr = new Node(arr[i]);
            head.next = curr;
            curr = head.next;
        }
        return head.next;
    }
}
