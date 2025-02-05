package com.practice.array;

public class FindSecondHigest {
    public static void main(String[] args) {
        int arr[] = {17, 12, 13, 14, 15};
        int num = findHigest(arr);
        System.out.println(num);
    }

    private static int findHigest(int[] arr) {
        int higest = Integer.MIN_VALUE;
        int j = 0;
        int i = 0;
        for (i = 1; i < arr.length; i++) {
            if (!(arr[j] < arr[i])) {
                System.out.println("Not sorted");
                break;
            }
            j++;
        }
        if (i == arr.length) {
            System.out.println("Sorted Array");
        }
        return higest;
    }
}