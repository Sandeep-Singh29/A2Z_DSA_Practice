package com.practice.leetcode.slidingwindow;

/**
 * Author: SANDEEP
 * Date: 21/10/24
 */

public class MaxConsecutiveZero_1004 {

    private static int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int zeros=0;

        while(end<nums.length){
            if(nums[end] == 0){
                zeros++;
            }
            end++;
            if(zeros>k){
                if(nums[start] == 0){
                    zeros--;
                }
                start++;
            }
        }
        return end-start;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
//        int longestOnes = longestOnes(nums, k);
//        System.out.println(longestOnes);
        int longested = longestOnesBrute(nums, k);
        System.out.println(longested);
    }

    private static int longestOnesBrute(int[] nums, int k) {
        int maxLen =0;
        for(int i=0;i<nums.length;i++){
            int zero=0;
            for(int j=i;j< nums.length;j++){
                if(nums[j]==0){
                    zero++;
                }
                if(zero<=k){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }

}
