package com.practice.leetcode.linkedlist.questionleetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: SANDEEP
 * Date: 29-09-2024
 */

public class SortList_148 {


    private static Node sortList(Node head) {
        if (head == null || head.next == null) return head;
        Node firstHalf = head;  // pehli list jo mid sa left wala node legi
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) { // odd and even list ka mid ko niklna ka liya
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = slow.next; // dusri list jo mid sa right wala node legi
        slow.next = null; // jaisa mid mai aa gya gaya to uska next ko secondList ko assign karaga
        firstHalf = sortList(firstHalf);
        secondHalf = sortList(secondHalf);
        Node merge = merge(firstHalf, secondHalf);
        return merge;
    }

    private static Node merge(Node firstHalf, Node secondHalf) {
        // Dummy node to start the merged list
        Node dummy = new Node(-1);
        Node current = dummy;
        // Traverse both lists
        while (firstHalf != null && secondHalf != null) {
            if (firstHalf.val < secondHalf.val) {
                current.next = firstHalf;
                firstHalf = firstHalf.next;
            } else {
                current.next = secondHalf;
                secondHalf = secondHalf.next;
            }
            current = current.next;
        }
        // If one of the lists is not empty, append it to the merged list
        if (firstHalf != null) {
            current.next = firstHalf;
        } else if (secondHalf != null) {
            current.next = secondHalf;
        }
        // Return the merged list, starting from the next of dummy node
        return dummy.next;
    }

    public static Node sortLLBruteForce(Node head) {
        // Create a list to
        // store node values
        List<Integer> arr = new ArrayList<>();

        // Temporary pointer to
        // traverse the linked list
        Node temp = head;

        // Traverse the linked list and
        // store node values in the list
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        // Sort the list
        // containing node values
        Collections.sort(arr);

        // Reassign sorted values to
        // the linked list nodes
        temp = head;
        for (int i = 0; i < arr.size(); i++) {
            // Update the node's data
            // with the sorted values
            temp.val = arr.get(i);
            // Move to the next node
            temp = temp.next;
        }

        // Return the head of the
        // sorted linked list
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(3);
        head.next = a;
        a.next = b;
        b.next = c;
        Node.displayList(head);
        Node result = sortList(head);
        Node.displayList(result);
//        Node head1 = sortLLBruteForce(head);
//        Node.displayList(head1);

    }

}