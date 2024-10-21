package com.practice.leetcode.slidingwindow;

/**
 * Author: SANDEEP
 * Date: 20/10/24
 */

public class LongestSubArrayAfterRemoveOne0_1493 {

    private static int longestSubarray(int[] arr) {
        int i = 0, j = 0, lastZero = -1, maxLen = 0;
        int len = arr.length;
        while (j < len) {
            if (arr[j] == 0) {
                i = lastZero + 1;
                lastZero = j;
            }
            maxLen = Math.max(maxLen, j - i);
            j++;
        }
        return maxLen;
    }


    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1, 1, 0, 1};
        int subArrayLen = longestSubarray(nums);
        System.out.println(subArrayLen);
    }

}
