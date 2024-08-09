package com.practice.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation_31 {
    public static void main(String[] args) {
        int arr[] = {2,1,3};
//        int res[] = findPermutation(arr);
        int res2[] = findPermutation2(arr);
//        System.out.println(Arrays.toString(res));
//        System.out.println(Arrays.toString(res2));
    }

    private static int[] findPermutation2(int[] nums) {
        int gola = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
               gola = i - 1;
                break;
            }
        }
        int swapIdx = gola;
        if(gola!=-1) {
            for (int j = nums.length - 1; j > 0; j--) {
                if (nums[j] > nums[gola]) {
                    swapIdx = j;
                    int temp = nums[gola];
                    nums[gola] = nums[swapIdx];
                    nums[swapIdx] = temp;
                    break;
                }
            }
        }
        swap(nums,gola+1,nums.length-1);
        return nums;
    }

    private static int[] findPermutation(int[] arr) {
        boolean flag = true;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                flag = false;
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
                swap(arr, i, arr.length - 1);
                break;
            }
        }
        if (flag) {
            swap(arr, 0, arr.length - 1);
        }
        return arr;
    }

    public static int[] swap(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }


}






/*
Steps >>
 1. array start right to left >> arr.lenght
 2. check if arr[i-1] < arr[i] if true than swap the value arr[i-1] to arr[i]  >> 1 3 4 5 2 >>after swap  1 3 5 4 2
 3. if 2 step is true than reverse the arr after arr[i-1] >> 1 3 5 4 2 >>> reverse value is >> 4 2 >>
 4. after the reverse 1 3 5 2 4 >>This is a next permutation of this array

 */
