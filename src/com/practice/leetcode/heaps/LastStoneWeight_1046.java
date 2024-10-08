package com.practice.leetcode.heaps;

import java.util.*;

/**
 * Author: SANDEEP
 * Date: 08/10/24
 */

public class LastStoneWeight_1046 {

    private static int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int e : stones) {
            list.add(e);
        }
        while (list.size() > 1) {
            Collections.sort(list);
            int x = list.remove(list.size() - 1);
            int y = list.remove(list.size() - 1);
            if (x != y) {
                list.add(x - y);
            }
        }
        if (list.size() == 0) {
            return 0;
        } else return list.get(0);
    }

    private static int lastStoneWeightway2Optiomal(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int e : stones){
            pq.add(e);
        }
        while(pq.size()>1){
            int x = pq.remove();
            int y = pq.remove();
            if(x!=y){
                pq.add(x-y);
            }
        }
        if(pq.size()==0) return 0;
        return pq.remove();
    }

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
//        int stoneWeight = lastStoneWeight(stones);
//        System.out.println(stoneWeight);
        int lasted = lastStoneWeightway2Optiomal(stones);
        System.out.println(lasted);
    }

}
