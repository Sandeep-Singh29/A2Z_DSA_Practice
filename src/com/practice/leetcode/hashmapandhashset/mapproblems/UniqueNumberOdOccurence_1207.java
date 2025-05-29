package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.*;

/**
 * Author: SANDEEP
 * Date: 05-10-2024
 */

public class UniqueNumberOdOccurence_1207 {

    private static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        // Insert all Values into set to check unique occurrences or not
        Set<Integer> set = new HashSet<>(map.values());
        // if map hold unique occurrence and also set have same element than return true else false
        return map.size() == set.size();
    }

    public static void main(String[] args) {
        int num[] = {1, 1, 2,2}; // true
//        int num[] = {1, 1, 2, 2}; // false
        boolean occurrences = uniqueOccurrences(num);
        System.out.println(occurrences);
        boolean occurrences1 = uniqueOccurrences1(num);
        System.out.println(occurrences1);
    }


    // Need this equation -1000 <=arr[i] <=1000 >> this is Constraints
    private static boolean uniqueOccurrences1(int[] num) {
        int[] frequencyArray = new int[2001];
        for (int val : num) {
            int indexAfterCount = val + 1000;
            frequencyArray[indexAfterCount]++;
        }
        Arrays.sort(frequencyArray);
        for (int i = 0; i < 2001; i++) {
            if (frequencyArray[i] != 0 && frequencyArray[i] == frequencyArray[i - 1]) {
                return false;
            }
        }
        return true;
    }

}