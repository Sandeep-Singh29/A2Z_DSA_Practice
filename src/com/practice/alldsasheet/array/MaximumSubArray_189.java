package com.practice.alldsasheet.array;

/**
 * Author: Sandeep Singh
 * Date: 31/01/25
 */

public class MaximumSubArray_189 {
    public static void main(String[] args) {
        int[] arr = {5, 4, -1, 7, 8};
        int max = maxSubArray(arr);
        System.out.println(max);
    }

    private static int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int j : arr) {
            sum += j;
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
