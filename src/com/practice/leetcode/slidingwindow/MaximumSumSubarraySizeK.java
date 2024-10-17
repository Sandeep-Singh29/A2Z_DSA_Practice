package com.practice.leetcode.slidingwindow;

/**
 * Author: SANDEEP
 * Date: 17-10-2024
 */

/*
Way 1>.
Hum sabhi subarray ka sum nikal lega k size ka
mean  array ka sum kar lega
-k kyoki mujhe size k mean 3 elemnt ka sum chaiya to last ka 2 elemnt sa farak nahi fadata
*/

public class MaximumSumSubarraySizeK {

    private static int maxSubArrayWithSizeK(int[] arr, int k) {
        int n = arr.length;
        int maxSum = 0;
        int i = 0, j = k - 1, sum = 0;
        for (int c = 0; c < k; c++) {
            sum += arr[c];
        }
        maxSum = Math.max(sum, maxSum);
        i++;
        j++;
        while (j < n) {
            sum = sum - arr[i - 1] + arr[j]; //  Main formula -i element and add+ j element
            maxSum = Math.max(sum, maxSum);
            i++;
            j++;
        }
        return maxSum;
    }

    private static int maxSubArrayWithSizeK1(int[] arr, int k) {
        int len = arr.length - k;
        int maxSum = 0;
        for (int i = 0; i <= len; i++) {
            int sum = 0;
            for (int j = i; j <= i + k - 1; j++) {
                sum += arr[j];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 1, 3, -40, 80, 10};
        int k = 3;
        int maxed = maxSubArrayWithSizeK(arr, k);
        System.out.println(maxed);
//        int maxed = maxSubArrayWithSizeK1(arr, k);
//        System.out.println(maxed);
    }

}