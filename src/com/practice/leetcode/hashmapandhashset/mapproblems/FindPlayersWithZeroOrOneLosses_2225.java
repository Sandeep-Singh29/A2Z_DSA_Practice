package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.*;

/**
 * Author: Sandeep Singh
 * Date: 26/05/25
 */

public class FindPlayersWithZeroOrOneLosses_2225 {

    public static void main(String[] args) {
        int[][] list = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
//        int[][] list = {{2,3},{1,3},{5,4},{6,4}};
        List<List<Integer>> winners = findWinners(list);
        System.out.println(winners);
    }

    public static List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> lostMap = new HashMap<>();
        for (int[] it : matches) {
            int lose = it[1];
            lostMap.put(lose, lostMap.getOrDefault(lose, 0) + 1);
        }
        List<Integer> newerLost = new ArrayList<>();
        List<Integer> oneLos = new ArrayList<>();
        for (int[] it : matches) {
            int lose = it[1];
            int win = it[0];
            if (lostMap.get(lose) == 1) {
                /*if (!oneLos.contains(lose)) {
                    oneLos.add(lose);
                }*/
                oneLos.add(lose);
            }
            if (!lostMap.containsKey(win)) {
               /* if (!newerLost.contains(win)) {
                    newerLost.add(win);
                }*/
                newerLost.add(win);
                lostMap.put(win, 2);
            }
        }
        Collections.sort(newerLost);
        Collections.sort(oneLos);
        return Arrays.asList(newerLost, oneLos);
    }

}
