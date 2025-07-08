package com.practice.array.aryandsasheet;

import java.util.Arrays;

/**
 * Author: Sandeep Singh
 * Date: 02/07/25
 */

public class MoveZeroes_283 {

    public static int[] moveZeroes(int[] nums) {
        int j =0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1};
        int[] nums1 = moveZeroes(nums);
        System.out.println(Arrays.toString(nums1));
    }
}
