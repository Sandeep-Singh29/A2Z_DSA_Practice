package com.practice.leetcode.binarysearch;

public class FindMinimumInSortedArray_153 {

    public static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {11,13,15,17};
        int min = findMin(arr);
        System.out.println(min);
        int minBinary = findMinUsingBinary(arr);
        System.out.println(minBinary);
    }

    private static int findMinUsingBinary(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr[high];
    }
}
