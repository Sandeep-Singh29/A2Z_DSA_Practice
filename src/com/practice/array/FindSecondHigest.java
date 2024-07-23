package com.practice.array;

public class FindSecondHigest {
    public static void main(String[] args) {
        int arr[] = {11, 3, 4, 55, 11, 1, 2, 11, 10, 16};
        int num = findHigest(arr);
        System.out.println(num);
    }

    private static int findHigest(int[] arr) {
        int higest = Integer.MIN_VALUE;
        int secondHigest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > higest) {
                secondHigest = higest;
                higest = num;
            } else if (num != higest && num > secondHigest) {
                secondHigest = num;
            }
        }
        return secondHigest;
    }
}
