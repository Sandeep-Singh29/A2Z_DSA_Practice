package com.practice.leetcode.array;

import java.util.Arrays;

public class MoveZeros_283 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        int newarr[] = moveZero(arr);
        System.out.println(Arrays.toString(newarr));
    }

    private static int[] moveZero(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] == 0 && arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        return arr;
    }
}
