package com.practice.leetcode.heaps;

import java.util.*;

/**
 * Author: SANDEEP
 * Date: 08/10/24
 */

public class LastStoneWeight_1046 {

    private static int lastStoneWeight(int[] stones) {
        if(stones.length==1){
            return stones[0];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int a : stones) {
            pq.add(a);
        }
        System.out.println(pq);
        List<Integer> list = new ArrayList<>(pq);
        Set<Integer> set = new HashSet<>();
        System.out.println(list);
        int i = 0;
        int j = 1;
        while (list.size()>1) {
            int x = list.get(i);
            int y = list.get(j);
            if (x != y) {
                list.add(x - y);
                list.remove(i);
                if(list.size()==1) return list.getFirst();
                list.remove(i);
            } else {
                list.remove(i);
                if(list.size()==1) return list.getFirst();
                list.remove(i);
            }
            Collections.sort(list.reversed());
        }
        return list.getFirst();
    }

    public static void main(String[] args) {
        int[] stones = {2, 2};
        int stoneWeight = lastStoneWeight(stones);
        System.out.println(stoneWeight);
    }

}
