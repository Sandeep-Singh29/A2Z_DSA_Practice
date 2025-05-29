package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 26/05/25
 */

/*Regroup the equation

num[i] - rev(num[i]) == num[j] - rev[num[j]];

*/

public class CountNicePairsInAnArray_1814 {

    final static int M = 1000000007;
    public static int countNicePairs(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        // nums[i] - reverse(nums[i]) == nums[j] - reverse(nums[j])
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] - reverseNum(nums[i]);
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = (int) ((result + mp.getOrDefault(nums[i], 0)) % M);
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        return result;
    }

    private static int reverseNum(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int nums[] = {13, 10, 35, 24, 76};
        int countNicePairs = countNicePairs(nums);
        System.out.println(countNicePairs);
    }

}
