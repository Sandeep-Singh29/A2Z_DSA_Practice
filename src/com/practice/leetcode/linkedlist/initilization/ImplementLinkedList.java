package com.practice.leetcode.linkedlist.initilization;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

class LinkList {
    Node head;
    Node tail;
    int size;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(Node next, int val) {
            this.next = next;
            this.val = val;
        }
    }

    public void insertAtEnd(int i) {
        Node node = new Node(i);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            /*while(true){
                if(head.next==null){
                    head.next = node;
                    break;
                }
                head = head.next;
            }*/
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

//    public int size() {
//        Node temp = head;
//        while(temp!=null){
//            size++;
//            temp = temp.next;
//        }
//        return size;
//    }

}

public class ImplementLinkedList {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertAtEnd(10);
        list.insertAtEnd(12);
        list.insertAtEnd(40);
        list.insertAtEnd(15);
        list.display();
        System.out.println();
        list.insertAtEnd(100);
        list.display();
//        int size = list.size();
        System.out.println();
        System.out.println("Size of List :  "+list.size);
        list.insertAtEnd(0);
        System.out.println("Size of List :  "+list.size);
        List<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(42);
        l.add(12);
        l.add(10);
        l.add(42);

    }
}


    /*System.out.println(l);
        l.set(0,3);
        System.out.println(l);
int[] array1 = l.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Array  "+Arrays.toString(array1));

     */