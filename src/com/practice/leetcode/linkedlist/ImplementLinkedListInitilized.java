package com.practice.leetcode.linkedlist;

public class ImplementLinkedListInitilized {

   static class Node{
        Node next;
        int data;
        Node(Node next, int data){
            this.next = next;
            this.data = data;
        }
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node node = new Node(arr[0]);
        System.out.println(node.data);
    }
}
