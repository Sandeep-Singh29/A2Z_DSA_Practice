package com.practice.leetcode.hashmapandhashset;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Author: SANDEEP
 * Date: 07/10/24
 */

public class NearlySortedUsingPriorityQueue {

    private static List<Integer> sortArray(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr) {
            pq.add(ele);
            if (pq.size() > k) {
                list.add(pq.remove());
            }
        }
        while (!pq.isEmpty()) {
            list.add(pq.remove());
        }

        return list;
    }


    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 4;
        List<Integer> res = sortArray(arr, k);
        System.out.println(res);
    }


}
