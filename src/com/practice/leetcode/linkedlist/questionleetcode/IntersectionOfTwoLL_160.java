package com.practice.leetcode.linkedlist.questionleetcode;

import java.util.Arrays;

public class IntersectionOfTwoLL_160 {

    private static Node getIntersectionNode(Node headA, Node headB) {
        Node temp1 = headA;
        Node temp2 = headB;
        int len1 = 0;
        int len2 = 0;
        while (temp1!=null) {
            len1++;
            temp1 = temp1.next;
        }
        while (temp2!=null) {
            len2++;
            temp2 = temp2.next;
        }
        temp1 = headA;
        temp2 = headB;
        if(len1>len2){
            for(int i=0;i<len1-len2;i++){
                temp1 = temp1.next;
            }
        }else {
            for(int i=0;i<len2-len1;i++){
                temp2 = temp2.next;
            }
        }
        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }

    public static void main(String[] args) {
        // LL 1
        Node head1 = new Node(4);
        Node a1 = new Node(1);
        Node b1 = new Node(8);
        Node c1 = new Node(4);
        Node d1 = new Node(5);

        // LL 1
        Node head2 = new Node(5);
        Node a2 = new Node(6);
        Node b2 = new Node(1);
        Node c2 = new Node(8);
        Node d2 = new Node(4);
        Node e2 = new Node(5);

        // LL Connection 1
        head1.next = a1;
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = null;

        // LL Connection 2
        head2.next = a2;
        a2.next = b2;
        b2.next = c2;
        c2.next = d2;
        d2.next = e2;
        e2.next = null;

        Node.displayList(head1);
        Node.displayList(head2);

        Node intersectionNode = getIntersectionNode(head1, head2);
        System.out.println(intersectionNode);



    }


}
