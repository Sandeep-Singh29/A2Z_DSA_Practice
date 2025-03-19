package com.practice.other;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Author: Sandeep Singh
 * Date: 18/03/25
 */

//    1 2 3 6 5 4 3 >> 6
//    3 4 5 8 7 6 5 4 >> 8

public class FIndPeakOfList {
    public static void main(String[] args) {

        List<Integer> list = List.of(4, 3, 2, 1, 0);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int v : list) {
            pq.add(v);
        }
        if (pq.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(pq.peek());
        }
    }
}


























