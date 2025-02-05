package com.practice.leetcode.slidingwindow;

/**
 * Author: SANDEEP
 * Date: 18-10-2024
 */

public class NumberOdSubArray_1343 {

    private static int numOfSubarrays(int[] arr, int k, int threshold) {
        int len = arr.length - k;
        int count = 0;
        for (int i = 0; i <= len; i++) {
            int sum = 0;
            for (int j = i; j <= i + k - 1; j++) {
                sum += arr[j];
//                    System.out.print(arr[j]+" ");
            }
            if (sum / k >= threshold) {
                count++;
            }
//                System.out.println();
        }
        return count;
    }

    private static int numOfSubarraysway2(int[] arr, int k, int threshold) {
        int n = arr.length;
        int count = 0;
        int i = 0, j = k - 1, sum = 0;
        for (int c = 0; c < k; c++) {
            sum += arr[c];
        }
        if (sum / k >= threshold) {
            count++;
        }
        i++;
        j++;
        while (j < n) {
            sum = sum - arr[i - 1] + arr[j]; //  Main formula -i element and add+ j element
            if (sum / k >= threshold) {
                count++;
            }
            i++;
            j++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3, threshold = 4;
//        int subarrays = numOfSubarrays(arr, k, threshold);
//        System.out.println(subarrays);
        int i = numOfSubarraysway2(arr, k, threshold);
        System.out.println(i);
    }

}