package com.practice.leetcode.array;

import java.util.Arrays;
import java.util.TreeMap;

public class SortColour_75 {

    public static int[] sortColors(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int zero = map.get(0);
        int one = map.get(1);
        int two = map.get(2);
        boolean flag = true;
        int j = 0;
        while (flag) {
            if (zero > 0) {
                nums[j++] = 0;
                zero--;
            } else if (zero == 0 && one > 0) {
                nums[j++] = 1;
                one--;
            } else {
                nums[j++] = 2;
                two--;
            }
            if (zero == 0 && one == 0 && two == 0) {
                flag = false;
                return nums;
            }
        }
        System.out.println(map);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
//        int[] res = sortColors(nums);
//        System.out.println(Arrays.toString(nums));
        int[] res = sortColorsway2(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static int[] sortColorsway2(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;   //  0, 0, 2, 1, 1, 2
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(low, mid, nums);
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(mid, high, nums);
                high--;
            }
        }
        return nums;
    }

    public static int[] swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

}
