package com.practice.leetcode.binarysearch;

import java.util.Arrays;

public class FirstAndLastPosition_34 {

    private static int firstSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int secondSearch(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = -1;
        res[1] = -1;
        if (nums.length == 0) return res;
        int first = firstSearch(nums, target);
        int second = secondSearch(nums, target);
        res[0] = first;
        res[1] = second;
        return res;
    }


    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10}, target = 8;
        int[] ints = searchRange(arr, target);
        System.out.println(Arrays.toString(ints));
        int[] rangeOptimal = searchRangeOptimal(arr,target);
        System.out.println(Arrays.toString(rangeOptimal));
    }


    public static int findFirstPosition1(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int result = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                result = mid; // possibly my answer
                r = mid - 1; // but lets look at left more
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }
    public static int findLastPosition1(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int result = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                result = mid; // possibly my answer
                l = mid + 1; // but lets look at right more
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    public static int[] searchRangeOptimal(int[] nums, int target) {
        int firstPosition = findFirstPosition1(nums, target);
        int lastPosition = findLastPosition1(nums, target);
        return new int[]{firstPosition, lastPosition};
    }

}
