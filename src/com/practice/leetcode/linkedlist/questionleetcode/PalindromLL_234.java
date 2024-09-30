package com.practice.leetcode.linkedlist.questionleetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: SANDEEP
 * Date: 30-09-2024
 */

public class PalindromLL_234 {

    private static boolean isPalindrome(Node head) {
        List<Integer> l = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            l.add(temp.val);
            temp = temp.next;
        }
        int left = 0;
        int right = l.size() - 1;
        while (left < right) {
            if (l.get(left) != l.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(1);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        Node.displayList(head);
//        boolean palindrome = isPalindrome(head);
//        System.out.println(palindrome);
//        boolean palindrome2 = isPalindromeUsingRecurion(head);
//        System.out.println(palindrome2);
//        boolean palindrome3 = isPalindromeUsingRecursionBestApproach(head);
//        System.out.println(palindrome3);
        boolean palindrome4 = isPalindromeUsingBestApproach(head);
        System.out.println(palindrome4);
    }

    private static boolean isPalindromeUsingBestApproach(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node reverse = reverseList(slow);
        Node check = head;
        while(reverse!=null){
            if(reverse.val!= check.val){
                return false;
            }
            reverse = reverse.next;
            check = check.next;
        }
        return true;
    }


    //    Time Complexity 0(n)
//    Space Complexity 0(1)
    private static boolean isPalindromeUsingRecursionBestApproach(Node head) {
        Node fast = head;
        Node slow = head;
        Node temp = head;
        Node newNode = new Node(-1);
        Node copyNode = newNode;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        while (fast != null && fast.next != null) {
            Node node = new Node(slow.val);
            copyNode.next = node;
            copyNode = copyNode.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        newNode = reverseList(newNode.next);
        if (count % 2 != 0) {
            slow = slow.next;
        }
        Node check = newNode;
        while (check != null) {
            if (check.val != slow.val) {
                return false;
            }
            slow = slow.next;
            check = check.next;
        }
        return true;
    }

    private static boolean isPalindromeUsingRecurion(Node head) {
        if (head == null || head.next == null) return true;
        Node newHead = new Node(head.val);
        Node deepCopy = newHead; // LL ki copy banagi
        Node temp = head.next;// next i liya kiya kyoki newHead main 1 node insert kar diya pehla hi
        while (temp != null) {
            Node node = new Node(temp.val);
            deepCopy.next = node;
            deepCopy = deepCopy.next;
            temp = temp.next;
        }
        newHead = reverseList(newHead);
        temp = head;
        while (temp != null) {
            if (temp.val != newHead.val) {
                return false;
            }
            newHead = newHead.next;
            temp = temp.next;
        }
        return true;
    }

    private static Node reverseList(Node newHead) {
        Node previous = null;
        Node current = newHead;
        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }

}