package com.practice.leetcode.linkedlist.questionleetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: SANDEEP
 * Date: 03/10/24
 */

public class AddTwoNumberLL_2 {

    private static Node addTwoNumbers(Node l1, Node l2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Node temp = l1;
        Node temp1 = l2;
        while (temp != null) {
            list1.add(temp.val);
            temp = temp.next;
        }
        while (temp1 != null) {
            list2.add(temp1.val);
            temp1 = temp1.next;
        }
        System.out.println(list1);
        System.out.println(list2);
        int lSize = list1.size() - 1;
        int jSize = list2.size() - 1;
        Node dummy = new Node(-1);
        Node copyNode = dummy;
        int i = 0;
        int j = 0;
        int carry = 0;
        while (lSize >= 0 || jSize >= 0 || carry != 0) {
            int sum = (lSize >= 0 ? list1.get(i) : 0) + (jSize >= 0 ? list2.get(j) : 0) + carry;
            carry = sum / 10;
            int digit = sum % 10;
            copyNode.next = new Node(digit);
            copyNode = copyNode.next;
            i++;
            j++;
            lSize--;
            jSize--;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node head1 = new Node(2);
        Node a = new Node(4);
        Node b = new Node(9);
        head1.next = a;
        a.next = b;
        Node head2 = new Node(5);
        Node a1 = new Node(6);
        Node b1 = new Node(4);
        Node c1 = new Node(9);
        head2.next = a1;
        a1.next = b1;
        b1.next = c1;
        Node.displayList(head1);
        Node.displayList(head2);
        Node node = addTwoNumbers(head1, head2);
        Node.displayList(node);
//        Node way2 = addTwoNumbersway2(head1, head2);
//        Node.displayList(way2);
    }

    private static Node addTwoNumbersway2(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum / 10;
            int digit = sum % 10;
            current.next = new Node(digit);
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }

    private static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }


}
