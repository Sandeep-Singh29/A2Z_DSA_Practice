package com.practice.leetcode.linkedlist.initilization;

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

    public static void main(String[] args) {
        ImplementLinkedList list = new ImplementLinkedList();
        list.insertAtTail(10);
        list.insertAtTail(12);
        list.insertAtTail(40);
        list.size();
        list.insertAtHead(1);
        list.display();
        list.size();
        list.set(2, 30);
        list.display();
        list.size();
        System.out.println("Get Element By index 2 :  " + list.get(2));
        list.delete(4);
        list.display();

        int a = 4;
        int b = (int) 7 / 2;
        System.out.println(b);
    }

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
        System.out.println();
    }

    public void size() {
        System.out.println(size);
    }

    private void insertAtHead(int data) {
        Node newHead = new Node(data);
        if (head == null) {
            head = newHead;
            tail = newHead;
        } else {
            newHead.next = head;
            head = newHead;
        }
        size++;
    }

    private void set(int idx, int data) {
        if (idx == 0) {
            insertAtHead(data);
            return;
        }
        if (idx == size) {
            insertAtTail(data);
            return;
        }
        if (idx > size) {
            System.out.println("Invalid Index..!!  ");
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
           /* while (temp != null) {
                if (idx - 1 == 0) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    size++;
                    break;
                }
                idx--;
                temp = temp.next;
            }*/
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    private int get(int idx) {
        Node temp = head;
        while (idx > 0 && temp != null) {
            temp = temp.next;
            idx--;
        }
//        System.out.println(temp.val);
        return temp.val;
    }

    private void delete(int idx) {  // 1-> 10-> 30-> 12-> 40-> null
        if (idx > size - 1 || idx < 0) {
            System.out.println("Invalid Index");
            return;
        }
        Node node = head;
        if (idx == 0) {
            head = head.next;
            return;
        }
        for (int i = 0; i < idx - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        size--;
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