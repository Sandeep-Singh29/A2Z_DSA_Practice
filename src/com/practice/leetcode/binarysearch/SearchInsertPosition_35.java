package com.practice.leetcode.binarysearch;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6};
        int target = 5;
        int idx = findIndex(arr, target);
        System.out.println(idx);
        int idx2 = findIndexUsingBinary(arr, target);
        System.out.println(idx2);
    }

    private static int findIndexUsingBinary(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int findIndex(int[] nums, int target) {
        if(nums[0]==target) return 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}
