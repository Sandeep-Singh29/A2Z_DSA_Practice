package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.*;

/**
 * Author: Sandeep Singh
 * Date: 29/05/25
 */

public class RestoreArrayFromAdjacentPairs_1743 {

    public static int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int findOneNeighbour = 0;
        for (int[] arr : adjacentPairs) {
            int first = arr[0];
            int second = arr[1];
            map.computeIfAbsent(first, k -> new ArrayList<>()).add(second);
            map.computeIfAbsent(second, k -> new ArrayList<>()).add(first);
        }
        for (Map.Entry<Integer, List<Integer>> m : map.entrySet()) {
            if (m.getValue().size() == 1) {
                findOneNeighbour = m.getKey();
                break;
            }
        }
        int[] result = new int[map.size()];
        dfs(findOneNeighbour, Integer.MAX_VALUE, result, 0, map);
        return result;
    }

    private static void dfs(int findOneNeighbour, int prev, int[] result, int i, Map<Integer, List<Integer>> map) {
        result[i] = findOneNeighbour;
        for (int neighbor : map.get(findOneNeighbour)) {
            if (neighbor != prev) {
                dfs(neighbor, findOneNeighbour, result, i + 1, map);
            }
        }
    }


    public static void main(String[] args) {
//        int[][] adjacentPairs = {{2, 1}, {3, 4}, {3, 2}};
        int[][] adjacentPairs = {{4, -2}, {1, 4}, {-3, 1}};
        int[] arr = restoreArray(adjacentPairs);
        System.out.println(Arrays.toString(arr));
    }
}

// this code also worked but gives Time limit Exceeded
/*
List<Integer> list = new ArrayList<>();
        list.add(findOneNeighbour);
        list.add(map.get(findOneNeighbour).getFirst());
findOneNeighbour = list.getLast();
        for (int i = 0; i < map.size(); i++) {
        if (map.containsKey(findOneNeighbour)) {
List<Integer> list1 = map.get(list.getLast());
                for (Integer val : list1) {
        if (!list.contains(val)) {
        list.add(val);
findOneNeighbour = (int) val;
                    }
                            }
                            }
                            }
                            return list.stream()
                .mapToInt(Integer::intValue)
       .toArray();    */