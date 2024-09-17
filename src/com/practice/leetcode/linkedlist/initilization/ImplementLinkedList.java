package com.practice.leetcode.linkedlist.initilization;

import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ImplementLinkedList {
    Node head;
    Node tail;
    int size;

    public void insertAtTail(int i) {
        Node node = new Node(i);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public int size() {
       return size;
    }

    private void insertAtHead(int data) {
        Node newHead = new Node(data);
        if(head==null){
            head = newHead;
            tail = newHead;
        }else{
            newHead.next = head;
            head = newHead;
        }
    }

    private void set(int idx, int data) {
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            tail = newNode;
        }else{
            while(head!=null){

            }
        }
    }

    public static void main(String[] args) {
        ImplementLinkedList list = new ImplementLinkedList();
        list.insertAtTail(10);
        list.insertAtTail(12);
        list.insertAtTail(40);
        list.insertAtTail(15);
        list.display();
        System.out.println();
        list.insertAtTail(100);
        list.display();
        System.out.println();
        System.out.println("Size of List: " + list.size()); // Using size() method
        list.insertAtTail(200);
        System.out.println("Size of List: " + list.size()); // Using size() method
        list.insertAtHead(7);
        list.display();
        list.set(3,500);

    }


}


/*
        // Example usage of java.util.LinkedList
        List<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(42);
        l.add(12);
        l.add(10);
        l.add(42);

        System.out.println("LinkedList: " + l);
        l.set(0, 3);
        System.out.println("Updated LinkedList: " + l);
        int[] array1 = l.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Array: " + Arrays.toString(array1));
        */