package com.practice.leetcode.linkedlist.questionleetcode;

/**
 * Author: SANDEEP
 * Date: 26-09-2024
 */

public class RemoveDuplicate_83 {


    private static Node deleteDuplicates(Node head) {  // 1 1
        Node temp = head;
        while(temp!=null && temp.next!=null){
            int second = temp.next.val;
            if(temp.val==second){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        Node a = new Node(2);
        Node b = new Node(1);
//        Node c = new Node(3);
//        Node d = new Node(3);
        head.next = a;
        a.next = b;
//        b.next = c;
//        c.next = d;
        Node.displayList(head);
        Node node = deleteDuplicates(head);
        Node.displayList(node);
    }


}

/*
public ListNode deleteDuplicates(ListNode head) {
    if(head== null || head.next==null){
        return head;
    }
    ListNode temp = head;
    while (temp.next != null) {
        if(temp.next.val == temp.val){
            temp.next = temp.next.next;
        }else{
            temp = temp.next;
        }
    }
    return head;
}
}
*/

/*

     TWO POINTER APPROACH

public ListNode deleteDuplicates(ListNode head) {
    if(head==null){
        return head;
    }
    ListNode a = head;
    ListNode b = head;
    while(b!=null){
        if(a.val==b.val){
            b = b.next;
        }else{
            a.next = b;
            a = b;
        }
    }
    a.next = b; // last case jab last main duplicae higa aur b pointer null main pahuch jayaga
    return head;
}

*/
