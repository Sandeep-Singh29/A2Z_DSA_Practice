package com.practice.alldsasheet.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 31/01/25
 */

public class SearchInRotatedArray_33 {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int search = search(nums, target);
        int usingArray = searchUsingArray(nums, target);
        System.out.println(search);
        System.out.println(usingArray);

    }

    private static int searchUsingArray(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int search(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        if (map.containsKey(target)) {
            return map.get(target);
        }
        return -1;
    }
}
