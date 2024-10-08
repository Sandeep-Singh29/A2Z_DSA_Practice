package com.practice.leetcode.heaps;

import java.util.*;

/**
 * Author: SANDEEP
 * Date: 08/10/24
 */

public class LastStoneWeight_1046 {

    private static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int a : stones) {
            pq.add(a);
        }
        System.out.println(pq);
        List<Integer> list = new ArrayList<>(pq);
        Set<Integer> set = new HashSet<>();
        System.out.println(list);
        for (int i = 1; i < list.size(); i++) {
            int x = list.get(i - 1);
            int y = list.get(i);
            if (x != y) {
                list.remove(i-1);
                list.remove(i-1);
                list.add(x - y);
            } else {
                list.remove(i-1);
                list.remove(i-1);
            }
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        int stoneWeight = lastStoneWeight(stones);
        System.out.println(stoneWeight);
    }

}
