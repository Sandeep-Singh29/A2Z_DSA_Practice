package com.practice.leetcode.binarysearch;

import java.util.HashMap;
import java.util.Map;

public class SingleElementInSortedArray_540 {

    public static int singleNonDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                return m.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 3, 4, 4, 9, 8, 8};
//        int i = singleNonDuplicate(nums);
//        System.out.println(i);
        int i = singleNonDuplicateUsingBS(nums);
        System.out.println(i);
    }

    private static int singleNonDuplicateUsingBS(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[high] != nums[high - 1]) return nums[high];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
