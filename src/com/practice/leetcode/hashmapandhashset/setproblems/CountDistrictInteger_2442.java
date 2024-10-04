package com.practice.leetcode.hashmapandhashset.setproblems;

import java.util.HashSet;

/**
 * Author: SANDEEP
 * Date: 03/10/24
 */

public class CountDistrictInteger_2442 {

    private static int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            int val = num;
            set.add(val);
            int ans = 0;
            while (val > 0) {
                int digit = val % 10;
                ans = ans * 10 + digit;
                val = val / 10;
            }
            set.add(ans);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int nums[] = {1, 13, 10, 12, 31};
        int counted = countDistinctIntegers(nums);
        System.out.println(counted);
    }
}
