package com.practice.leetcode.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Author: SANDEEP
 * Date: 06-10-2024
 */
/*
 <MIN HEAP>
MIN - Heap(PriorityQueue) ek aisa data structure hai jab bhi hum isma
element add karata hai to bo hamsa small
element top main rakhta hai.

PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); Agar aap aisa karata hai to Kam sa jadha hoga


<MAX HEAP>
MAX - Heap(PriorityQueue) ek aisa data structure hai jab bhi hum isma
element add karata hai to bo hamsa greater
element top main rakhta hai.

 PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());   Agar aap Collections.reverseOrder() karata hai to decreasing wise jadha sa kam


*/

public class BasicHeap {
    public static void main(String[] args) {

        // MIN HEAP
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        System.out.println(pq + " Peak is : " + pq.peek());
        pq.add(1);
        System.out.println(pq + " Peak is : " + pq.peek());
        pq.add(10);
        System.out.println(pq + " Peak is : " + pq.peek());
        pq.remove();
        System.out.println(pq + " Peak is : " + pq.peek());
        pq.add(-2);
        System.out.println(pq + " Peak is : " + pq.peek());
        pq.add(9);
        System.out.println(pq + " Peak is : " + pq.peek());

        System.out.println();
        System.out.println();
        System.out.println("----MAX PRIORITY QUEUE----");

        // MAX HEAP
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(4);
        System.out.println(pq1 + " Peak is : " + pq1.peek());
        pq1.add(1);
        System.out.println(pq1 + " Peak is : " + pq1.peek());
        pq1.add(10);
        System.out.println(pq1 + " Peak is : " + pq1.peek());
        pq1.remove();
        System.out.println(pq1 + " Peak is : " + pq1.peek());
        pq1.add(-2);
        System.out.println(pq1 + " Peak is : " + pq1.peek());
        pq1.add(9);
        System.out.println(pq1 + " Peak is : " + pq1.peek());
    }

}