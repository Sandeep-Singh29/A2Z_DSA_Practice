package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.*;

/**
 * Author: SANDEEP
 * Date: 05-10-2024
 */

public class UniqueNumberOdOccurence_1207 {

    private static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }

    public static void main(String[] args) {
        int num[] = {1, 2};
        boolean occurrences = uniqueOccurrences(num);
        System.out.println(occurrences);
    }

}