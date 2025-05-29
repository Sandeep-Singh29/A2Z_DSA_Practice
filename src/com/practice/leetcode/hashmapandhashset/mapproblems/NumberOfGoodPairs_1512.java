package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 29/05/25
 */

public class NumberOfGoodPairs_1512 {

    public static int numIdenticalPairs1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += map.getOrDefault(nums[i], 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return result;
    }


    public static int numIdenticalPairs2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int value = m.getValue();
            result += value * (value - 1) / 2;
        }
        return result;
    }

    public static int numIdenticalPairs3(int[] nums) {
        int result = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1, 1, 3};
        int pairs = numIdenticalPairs1(nums);
        System.out.println(pairs);
        int pairs2 = numIdenticalPairs2(nums);
        System.out.println(pairs2);
        int pairs3 = numIdenticalPairs3(nums);
        System.out.println(pairs3);
    }

}
