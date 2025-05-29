package com.practice.recrointerviewquestion;

/**
 * Author: Sandeep Singh
 * Date: 25/05/25
 */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeleteNodeInBackSide {

    public static Node deleteFromBack(Node head, int target, int n) {
        Counter counter = new Counter();
        return deleteRecursively(head, target, n, counter);
    }

    private static Node deleteRecursively(Node node, int target, int n, Counter counter) {
        if (node == null) return null;
        node.next = deleteRecursively(node.next, target, n, counter);
        if (node.data == target) {
            counter.count++;
            if (counter.count == n) {
                // Delete this node
                return node.next;
            }
        }
        return node;
    }

    // Helper to print the list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(6);

        System.out.println("Original List:");
        printList(head);
        int removeElement = 2;
        head = deleteFromBack(head, removeElement, 1);
        System.out.println("After deleting 1st " + removeElement + " from the back:");
        printList(head);
    }

    static class Counter {
        int count = 0;
    }

}
