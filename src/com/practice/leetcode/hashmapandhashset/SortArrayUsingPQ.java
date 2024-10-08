package com.practice.leetcode.hashmapandhashset;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Author: SANDEEP
 * Date: 07/10/24
 */

public class SortArrayUsingPQ {

    private static List<Integer> sortArray(int[] arr) {
        List<Integer> list = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int e : arr) {
            pq.add(e);
        }
        while (!pq.isEmpty()) {
            list.add(pq.remove());
        }
        return list;
    }


    public static void main(String[] args) {
        int arr[] = {8, 7, 6, 4, 1, 6, 7, 8,};
        List<Integer> res = sortArray(arr);
        System.out.println(res);
    }

}
