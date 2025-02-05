package com.practice.practice;


/**
 * Author: SANDEEP
 * Date: 15/01/25
 */

public class Testtt {

    public static void main(String[] args) {

//        Maximum Subarray Sum

        int[] nums = {-2, 1, -3, 4, 2, 1, 4};
        int sum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            sum += val;
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxSum);

    }
}