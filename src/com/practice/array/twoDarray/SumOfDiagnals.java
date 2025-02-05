package com.practice.array.twoDarray;

public class SumOfDiagnals {
    public static void main(String[] args) {
        int r = 3;
        int c = 3;
        int arr[][] = new int[r][c];
        int count = 1;
        int sum = 0;
        int rightDiagonal = 0;
        System.out.println("Left Diagonal");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = count++;
                if (i == j) {
                    sum += arr[i][j];
                }
                if (i + j == r) {
                    rightDiagonal += arr[i][j];
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sum of the Left Diagonal : " + sum);
        System.out.println("Sum of the Right Diagonal : " + rightDiagonal);
    }
}
