package com.practice.leetcode.linkedlist.questionleetcode;

public class MiddleListNodeReturn {

    private static int returnMiddleNode(Node head) {
        Node temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int size = count/2;
        Node dummy = head;
        int i =0;
        while(dummy!=null){
            if(i==size){
                return dummy.val;
            }
            i++;
            dummy = dummy.next;
        }
        return dummy.val;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        Node.displayList(head);
        int middleNode = returnMiddleNode(head);
        System.out.println(middleNode);



    }
}
