package com.practice.array.twoDarray;

public class SumOfTwoDimentionalArray {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sumArray[][] = printSumOfArray(arr, arr2);
        printArrays(sumArray);
    }

    private static void printArrays(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] printSumOfArray(int[][] arr, int[][] arr1) {
        int sumArray[][] = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumArray[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        return sumArray;
    }
}
