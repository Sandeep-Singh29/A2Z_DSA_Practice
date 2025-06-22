package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 13/06/25
 */

public class ContainsDuplicateII_219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true;  // i-j <= k
                }
            }
            map.put(nums[i], i); // if nums[i] not contains in Map
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        boolean containsNearbyDuplicate = containsNearbyDuplicate(nums, k);
        System.out.println(containsNearbyDuplicate);
    }

}
