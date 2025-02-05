package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: SANDEEP
 * Date: 05-10-2024
 */

public class TwoSum_1 {

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Stored a Value and index
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i]; // element of Array
            int sum = target - num; // find the element if target is 10 ans num is 5 so 10-5 = 5 if 5 is present than ans find
            if (map.containsKey(sum)) {
                arr[0] = map.get(sum);
                arr[1] = i;
                return arr;
            } else {
                map.put(num, i);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15}, target = 9;
        int[] nums1 = twoSum(nums, target);
        System.out.println(Arrays.toString(nums1));
    }

}







