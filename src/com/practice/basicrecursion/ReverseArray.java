package com.practice.basicrecursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arrr[] = {1, 2, 3, 4, 5, 6};
        int start = 0;
        int end = arrr.length - 1;
        System.out.println("Before Reverse : " + Arrays.toString(arrr));
        int arr[] = rever(arrr, start, end);
        System.out.println("After Reverse : " + Arrays.toString(arr));
    }

    private static int[] rever(int[] arrr, int start, int end) {
        if (start > end) {
            return arrr;
        }
        int temp = arrr[start];
        arrr[start] = arrr[end];
        arrr[end] = temp;
        rever(arrr, start + 1, end - 1);
        return arrr;
    }

}
