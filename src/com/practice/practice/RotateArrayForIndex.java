package com.practice.practice;

import java.util.Arrays;

public class RotateArrayForIndex {

    private static void reverse(int[] nums, int l, int r) {
        while (l < r)
            swap(nums, l++, r--);
    }
    private static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    private static void swap(int[] nums, int l, int r) {
        final int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    public static void main(String[] args) {
       int arr [] = {1,2,3,4,5,6};
       int k =3;
       rotate(arr,k);

    }

}
