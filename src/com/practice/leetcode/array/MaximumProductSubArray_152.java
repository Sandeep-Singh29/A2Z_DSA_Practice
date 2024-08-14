package com.practice.leetcode.array;

import java.util.Arrays;

public class MaximumProductSubArray_152 {

    public static int maxProduct(int[] nums) {  //-2, 3, -4
        int maxPro = Integer.MIN_VALUE;
        int start = nums[0];
        int product =start;
        for (int i = 1; i < nums.length; i++) {
            product *= nums[i];
            maxPro = Math.max(maxPro,product);
        }
        int last = nums[nums.length - 1];
        if(maxPro<last){
            return last;
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int arr[] = {-3,0,1,-2};
        int sum = maxProduct(arr);
        System.out.println(sum);
    }
}
