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
        int[] ints1 = searchRange(arr, target);
        System.out.println(Arrays.toString(ints1));
    }

    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int first = 0;
            int last = 0;
            boolean firstFlag = true;
            int findArr[] = new int[2];
            if (nums.length == 0) {
                findArr[0] = -1;
                findArr[1] = -1;
                return findArr;
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target && firstFlag) {
                    first = i;
                    firstFlag = false;
                }
                if (nums[i] == target) {
                    last = i;
                }
            }
            if (firstFlag) {
                findArr[0] = -1;
                findArr[1] = -1;
                return findArr;
            }
            findArr[0] = first;
            findArr[1] = last;
            // System.out.println(Arrays.toString(findArr));
            return findArr;
        }
    }
}
