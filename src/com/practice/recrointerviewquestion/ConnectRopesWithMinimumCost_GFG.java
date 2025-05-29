package com.practice.recrointerviewquestion;

import java.util.PriorityQueue;

/**
 * Author: Sandeep Singh
 * Date: 25/05/25
 */


public class ConnectRopesWithMinimumCost_GFG {


    public static int minCost(int[] arr) {
        int totalCost = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int rope : arr) {
            minHeap.add(rope);
        }
        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            int cost = first + second;
            totalCost += cost;
            minHeap.add(cost);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,4,8,6,9};
        int minCost = minCost(arr);
        System.out.println(minCost);
    }

}
