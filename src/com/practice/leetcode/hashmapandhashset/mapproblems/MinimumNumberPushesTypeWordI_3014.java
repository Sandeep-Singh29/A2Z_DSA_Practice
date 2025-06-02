package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 30/05/25
 */

public class MinimumNumberPushesTypeWordI_3014 {

    public static int minimumPushesOptimal(String word) {
        return 0;
    }

    public static int minimumPushes(String word) {
        int assignKey = 2;
        Map<Integer, Integer> map = new HashMap<>();
        int n = word.length();
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (assignKey > 9) {
                assignKey = 2;
            }
            map.put(assignKey, map.getOrDefault(assignKey, 0) + 1);
            result += map.get(assignKey);
            assignKey++;
        }
        return result;
    }

    public static void main(String[] args) {
        String word = "xycdefghij";
        int minimumPushes = minimumPushes(word);
        System.out.println(minimumPushes);
        int minimumPushesOptimal = minimumPushesOptimal(word);
        System.out.println(minimumPushesOptimal);
    }

}
