package com.practice.leetcode.binarysearch;

public class BinarySearch_704 {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid =0;
        while (low<=high){
            mid = (low+high)/2;
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 3, 5, 9, 12}, target = 9;
        int search = search(nums, target);
        System.out.println(search);
    }
}
