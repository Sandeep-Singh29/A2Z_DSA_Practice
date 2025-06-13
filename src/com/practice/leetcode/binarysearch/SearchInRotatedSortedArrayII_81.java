package com.practice.leetcode.binarysearch;

/**
 * Author: Sandeep Singh
 * Date: 12/06/25
 */

public class SearchInRotatedSortedArrayII_81 {

    public static boolean search(int[] nums, int target) {
        int n = nums.length - 1;
        int pivot_index = findPivot(nums);
        if (binarySearchFindTarget(0, pivot_index, nums, target)) {
            return true;
        }
        if (binarySearchFindTarget(pivot_index, n, nums, target)) {
            return true;
        }
        return false;
    }

    private static boolean binarySearchFindTarget(int l, int r, int[] nums, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    private static int findPivot(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            while (l < r && nums[l] == nums[l + 1]) { // skip duplicate element in left side
                l++;
            }
            while (l < r && nums[r] == nums[r - 1]) { // skip duplicate element in right side
                r--;
            }
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,3,2,2,2};
        int target = 3;
        boolean search = search(nums, target);
        System.out.println(search);
    }

}
