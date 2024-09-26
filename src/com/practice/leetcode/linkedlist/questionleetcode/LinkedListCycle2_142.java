package com.practice.leetcode.linkedlist.questionleetcode;


/**
 * Author: SANDEEP
 * Date: 26-09-2024
 */

public class LinkedListCycle2_142 {

    private static Node detectCycle(Node head) {
        if(head==null || head.next==null){  // check if sinle number and 2 number
            return null;
        }
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast!=slow){
            return null;
        }
        Node check = head;
        while(check!=slow){
            check = check.next;
            slow = slow.next;
            if(check==slow){
                return slow;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        Node a = new Node(2);
        Node b = new Node(0);
        Node c = new Node(-4);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = a;
        Node node = detectCycle(head);
        System.out.println(node);
    }

}



/*

public ListNode detectCycle(ListNode head) {
    if(head==null){
        return null;
    }
    ListNode fast = head;
    ListNode slow = head;
    while(fast!=null && fast.next!=null){
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow){
            break;
        }
    }
    ListNode temp = head;
    while(slow!=null && slow.next!=null){
        if(temp==slow){
            return slow;
        }
        temp = temp.next;
        slow = slow.next;
    }
    return null;
}
}

*/
