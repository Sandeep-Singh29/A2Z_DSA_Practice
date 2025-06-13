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
        int arr[] = {11, 13, 15, 17};
        int min = findMin(arr);
        System.out.println(min);
        int minBinary = findMinUsingBinary(arr);
        System.out.println(minBinary);
    }

    private static int findMinUsingBinary(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[right];
    }
}
