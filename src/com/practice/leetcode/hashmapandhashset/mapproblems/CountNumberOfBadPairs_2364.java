package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 02/06/25
 */

public class CountNumberOfBadPairs_2364 {

    public static long countBadPairs(int[] nums) {
        int n = nums.length;
        long result = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] - i;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 1);
        for (int j = 1; j < n; j++) {
            int countOfNumsj = map.getOrDefault(nums[j], 0);
            int totalNumsBeforej = j;
            int badPairs = totalNumsBeforej - countOfNumsj;
            result += badPairs;

            map.put(nums[j], countOfNumsj + 1);
        }
        return result;
    }

    public static long countBadPairsBruteForce(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i < j && j - i != nums[j] - nums[i]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 3, 3};
        long countBadPairs = countBadPairs(nums);
        System.out.println(countBadPairs);
        long countBadPairsBruteForce = countBadPairsBruteForce(nums);
        System.out.println(countBadPairsBruteForce);
    }

}
