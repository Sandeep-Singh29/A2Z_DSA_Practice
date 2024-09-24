package com.practice.leetcode.linkedlist.questionleetcode;

public class RemoveNthNodeIntoEnd_19 {

    private static Node removeNthFromEnd(Node head, int n) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        // Edge Case if count==n
        if (count == n) {
            return head.next;
        }
        temp = head;
        int size = count - n + 1 - 1;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
//        Node b = new Node(3);
//        Node c = new Node(4);
//        Node d = new Node(5);
        head.next = a;
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = null;
        Node.displayList(head);
        int node = 1;
//        Node afterRemove = removeNthFromEnd(head, node);
//        Node.displayList(afterRemove);
        Node way2 = removeNthFromEndWay2(head, node);
        Node.displayList(way2);
    }

    private static Node removeNthFromEndWay2(Node head, int node) { // 1 2 3 4 5
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < node; i++) {  // agar fast node tak travel karega aur fast == null ho gaya to edge case main jayaga
            fast = fast.next;
        }
        if (fast == null) { // Edge case len==node agae fast last tak travel karaga
            return head.next;
        }
        while (fast.next != null) { // agar fast.next !=null matalab abhi element nikal sakta ha and fast ko travel kar sakta hai
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
