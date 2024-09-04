package com.practice.leetcode.binarysearch;

public class BinarySearch_704 {
    public static int search(int[] nums, int target) {
        int low = 0;
         int high = nums.length - 1;
        while (low < high) {
//            int mid = (low + high) / 2;
            int mid = low+(high-low)/2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 3, 5, 9, 12}, target = 9;
        int search = search(nums, target);
        System.out.println(search);
    }
}
