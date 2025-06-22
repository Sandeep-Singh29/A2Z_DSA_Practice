package com.practice.leetcode.binarysearch;

public class FindPeakElement_162 {

    public static int findPeakElementUsingBinarySearch(int[] nums) {
        if (nums.length == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;
        int low = 1;
        int high = nums.length - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] < nums[mid - 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 7};
        int peakElement = findPeakElementUsingBinarySearch(nums);
        System.out.println(peakElement);
        int usingLinear = findPeakElementUsingLinear(nums);
        System.out.println(usingLinear);
    }

    private static int findPeakElementUsingLinear(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums[0] > nums[1]) return nums[0];
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums[nums.length - 1];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
