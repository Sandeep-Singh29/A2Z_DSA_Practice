package com.practice.leetcode.binarysearch;

/**
 * Author: Sandeep Singh
 * Date: 11/06/25
 */

public class SearchinRotatedSortedArray_33 {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int search = search(nums, target);
        System.out.println(search);
    }

    private static int findPivotElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return r;
    }

    private static int findTargetElementBinarySearch(int l, int r, int target, int[] nums) {
        int result = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                result = mid;
                break;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    public static int search(int[] nums, int target) {
        int n = nums.length - 1;
        int pivot_index = findPivotElement(nums); // find pivot and split array into 2 Part
        int index = findTargetElementBinarySearch(0, pivot_index, target, nums); //find target on left Side
        if (index != -1) { // agar -1 nahi hoga to matlab left main mil gaya hai
            return index;
        }
        index = findTargetElementBinarySearch(pivot_index, n, target, nums); //find target on left Side
        return index;
    }

}
