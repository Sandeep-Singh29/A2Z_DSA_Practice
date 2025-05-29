package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 29/05/25
 */

public class BinaryTreesWithFactors_823 {
    public static int numFactoredBinaryTrees(int[] arr) {
        int MOD = 1000000007;
        Map<Long, Long> map = new HashMap<>();
        Arrays.sort(arr);
        for (int val : arr) {
            map.put((long) val, 1L); // initialize each value with 1 (single-node tree)
        }
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
            // arr[i] % arr[j] == 0 means LeftChild Inserted and Condition passes
                boolean leftChildCondition = arr[i] % arr[j] == 0;
                if (leftChildCondition) {
                    long rightChild = arr[i] / arr[j];
                    if (map.containsKey(rightChild)) {
                       // if key are present for both LC and RC than value will we calculated
                       // LC value * RC value >> the count of possible way to binary Tree Root
                        long countOfLcAndRcValue = (map.get((long) arr[j]) * map.get(rightChild)) % MOD;
                        long totalPossibleWays = (map.get((long) arr[i]) + countOfLcAndRcValue) % MOD;
                        map.put((long) arr[i], totalPossibleWays);
                    }
                }
            }
        }
        long ans = 0;
        for (long val : map.values()) {
            ans = (ans + val) % MOD; // calculate the value for all keys
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 10};
        int binaryTrees = numFactoredBinaryTrees(arr);
        System.out.println(binaryTrees);
    }

}
