package com.practice.leetcode.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CheckArraySortedOrRotated_1752 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
//        boolean check = rotateofSort(nums);
//        System.out.println(check);
        boolean check1 = rotateofSort2(nums);
        System.out.println(check1);

    }

    private static boolean rotateofSort2(int[] nums) {
        List<Integer> list = new LinkedList<>();
        int k = 0;
        for (k = 1; k < nums.length; k++) {
            if (nums[k - 1] <= nums[k]) {
                list.add(nums[k - 1]);
            }
        }
        if (nums[k - 1] > nums[k - 2]) {
            list.add(nums[k - 1]);
        }
        int position = list.size();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (position < nums.length) {
                nums[i] = nums[position];
                position++;
            } else {
                nums[i] = list.get(j);
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= nums[i]) {

            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean rotateofSort(int[] nums) {
        int breakp = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= nums[i]) {
                breakp++;
            } else {
                break;
            }
        }
        int arr1[] = reversePositionandCheck(nums, 0, breakp);
        System.out.println(Arrays.toString(arr1));
        int arr2[] = reversePositionandCheck(nums, breakp + 1, nums.length - 1);
        System.out.println(Arrays.toString(arr2));
        int arr3[] = reversePositionandCheck(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(arr3));
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true;
    }

    private static int[] reversePositionandCheck(int[] nums, int i, int breakp) {
        while (i < breakp) {
            int temp = nums[i];
            nums[i] = nums[breakp];
            nums[breakp] = temp;
            i++;
            breakp--;
        }
        return nums;
    }
}
