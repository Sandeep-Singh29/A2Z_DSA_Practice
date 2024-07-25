package com.practice.array;

public class FindTheSmallestNumberInLeftArray {
    public static void main(String[] args) {
        int arr[] = {4, 3, 5, 7, 1, 6, 7, 8, 6, 4, 23};
        int smallNumber = findSmall(arr);
        System.out.println(smallNumber);
    }

    private static int findSmall(int[] arr) {
        int half = arr.length / 2;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < half; i++) {
            small = Math.min(small, arr[i]);
        }
        return small;
    }
}
