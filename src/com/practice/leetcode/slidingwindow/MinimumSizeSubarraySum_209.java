package com.practice.leetcode.slidingwindow;

/**
 * Author: SANDEEP
 * Date: 18-10-2024
 */

public class MinimumSizeSubarraySum_209 {

    private static int minSubArrayLen(int target, int[] arr) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                count++;
                if (sum >= target) {
                    minLen = Math.min(minLen, count); // find the len =  j-i+1 same as count
                    break;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    private static int minSubArrayLenWay2(int target, int[] nums) { // 2, 3, 1, 2, 4, 3
        int i = 0, j = 0;
        int sum = 0; // count the sum all elements
        int size = nums.length;
        int minL = Integer.MAX_VALUE;
        while (j < size) {
            sum += nums[j]; // add element
            while (sum >= target) { // jab sum target sa equal ya jadha hoga tab hi while mein jayaga
                minL = Math.min(minL, j - i + 1); // subArray ki len nikal li
                sum -= nums[i]; // aur start ka ith element ko - karaga jaisa >> 2+3+1+2=8 to muje ab dusri dekhna hai tabhi
                i++; // jab chak sum target sawada hai check karta rahaga jab tak while false nahi hota
            }
            j++;
        }
       return minL == Integer.MAX_VALUE ? 0 : minL;
    }

    public static void main(String[] args) {
        int target = 7, nums[] = {2, 3, 1, 8, 4, 3};
//        int subArrayLen = minSubArrayLen(target, nums);
//        System.out.println(subArrayLen);
        int lenWay2 = minSubArrayLenWay2(target, nums);
        System.out.println(lenWay2);
    }

}