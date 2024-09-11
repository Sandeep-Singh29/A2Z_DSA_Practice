package com.practice.leetcode.binarysearch;

public class FindSmallestDivision_1283 {

    private static int smallestDivisor(int[] nums, int threshold) {
        int high = 0;
        for (int v : nums) {
            high = Math.max(high, v);
        }
        int low = 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isThreshold(nums, mid, threshold)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isThreshold(int[] nums, int mid, int threshold) {
        int totalThres = 0;
        for (int v : nums) {
            totalThres += Math.ceil((double) (v) / (double) (mid));
        }
        return totalThres <= threshold;
    }

    public static void main(String[] args) {
        int arr[] = {44, 22, 33, 11, 1};
        int threhold = 5;
        int divisor = smallestDivisor(arr, threhold);
        System.out.println(divisor);
        int div = smallestDivisorBrute(arr, threhold);
        System.out.println(div);
    }

    private static int smallestDivisorBrute(int[] arr, int limit) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        for (int d = 1; d <= maxi; d++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.ceil((double) (arr[i]) / (double) (d));
            }
            if (sum <= limit)
                return d;
        }
        return -1;
    }
}
