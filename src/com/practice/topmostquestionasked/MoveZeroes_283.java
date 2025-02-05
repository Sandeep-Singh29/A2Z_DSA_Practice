package com.practice.topmostquestionasked;

import java.util.Arrays;

public class MoveZeroes_283 {
    private static int[] moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[j] = 0;
            j++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 6, 0, 3, 12, 0};
        int[] ints = moveZeroes(arr);
        System.out.println(Arrays.toString(ints));
        int[] intss = moveZeroes2(arr);
        System.out.println(Arrays.toString(intss));

    }

    private static int[] moveZeroes2(int[] arr) {
        int l = 0;
        for (int r = 1; r < arr.length; r++) {
            if (arr[l] == 0 && arr[r] != 0) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
            }
        }
        return arr;
    }
}
