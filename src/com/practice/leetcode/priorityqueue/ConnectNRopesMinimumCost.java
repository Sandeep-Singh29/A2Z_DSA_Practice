package com.practice.leetcode.priorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Author: SANDEEP
 * Date: 09/10/24
 */

public class ConnectNRopesMinimumCost {

    private static long connectRopes(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int e : arr) {
            list.add(e);
        }
        Collections.sort(list);
        System.out.println(list);
        long minCost = 0;
        while (list.size() > 1) {
            Integer start = list.removeFirst();
            Integer startNext = list.removeFirst();
            int cost = start + startNext;
            list.addFirst(cost);
            minCost += cost;
            Collections.sort(list);
        }
        return minCost;
    }

    private static long minCostRope(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int j : arr) {
            pq.add(j);
        }
        long totalCost = 0;
        while (pq.size() > 1) {
            int first = pq.remove();
            int second = pq.remove();
            totalCost = totalCost + first + second;
            pq.add(first + second);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        long connectRopes = connectRopes(arr);
        System.out.println(connectRopes);
//        long connectRopes = minCostRope(arr);
//        System.out.println(connectRopes);
    }

}
// 1 2 3 4 5

/*
3+6+10+15




*/

