package com.practice.recrointerviewquestion;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 24/05/25
 */

public class CountNumberofBadPairs_2364 {

    public static void main(String[] args) {
        int[] nums = {4, 1, 3, 3, 8};
        long countBadPairs = countBadPairs(nums);
        System.out.println(countBadPairs);
    }


    public static long countBadPairs1(int[] nums) {
        long n = nums.length;
        long goodPairs = 0;
        long totalPairs = n * (n - 1) / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = i - nums[i];
            int prevCount = map.getOrDefault(val, 0);
            goodPairs += prevCount;
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return totalPairs - goodPairs;
    }

    public static long countBadPairs(int[] nums) {
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (j - i != nums[j] - nums[i]) {  // Condition needed for Bad Pairs
                    ans++;
                }
            }
        }
        return ans;
    }


}
