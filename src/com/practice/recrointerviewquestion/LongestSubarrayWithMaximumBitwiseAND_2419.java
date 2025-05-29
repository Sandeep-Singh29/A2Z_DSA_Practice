package com.practice.recrointerviewquestion;

/**
 * Author: Sandeep Singh
 * Date: 24/05/25
 */

public class LongestSubarrayWithMaximumBitwiseAND_2419 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 2, 2};
        int longestSubarray = longestSubarray(nums);
        System.out.println(longestSubarray);
    }

    public static int longestSubarray(int[] nums) {
        int maxVal = 0;
        int result = 0;
        int streak = 0;
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
                result = 0;
                streak = 0;
            }
            if (maxVal == num) {
                streak++;
            } else {
                streak = 0;
            }
            result = Math.max(result, streak);
        }
        return result;
    }

}
