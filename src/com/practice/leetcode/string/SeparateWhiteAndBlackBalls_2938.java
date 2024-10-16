package com.practice.leetcode.string;

/**
 * Author: SANDEEP
 * Date: 15-10-2024
 */

public class SeparateWhiteAndBlackBalls_2938 {

    private static long minimumSteps(String s) {
        int last =0;
        long swapCount=0;
        for(int cur=0;cur<s.length();cur++){
            if(s.charAt(cur)=='0'){
                swapCount+=(cur-last);
                last++;
            }
        }
        return swapCount;
    }

    public static void main(String[] args) {
        String s = "0111";
        long steps = minimumSteps(s);
        System.out.println(steps);
    }

}