package com.practice.leetcode.priorityqueue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Author: SANDEEP
 * Date: 08/10/24
 */

public class TopKFrequentElement_347 {

    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1); // get all element frequnecy
        }
        System.out.println(map);
        // sort PQ by value i need to sort by Value in decreasing >> jadha sa kam
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((e1, e2) -> e1.getValue() - e2.getValue());
        pq.addAll(map.entrySet()); // add map data into PQ
        System.out.println("PQ >  " + pq);
        int[] res = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            if (pq.size() <= k) { // Jab tak pq ka size k ka bararbar hai ya kam hai tab bhi data add hoga
                Map.Entry<Integer, Integer> pqMap = pq.remove();
                res[i] = pqMap.getKey();
                i++;
            } else { // agar pq ka size > than k hai to pq sa remove karaga
                pq.remove();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        int k = 2;
        int[] topKFrequent = topKFrequent(nums, k);
        System.out.println(Arrays.toString(topKFrequent));
    }
}
