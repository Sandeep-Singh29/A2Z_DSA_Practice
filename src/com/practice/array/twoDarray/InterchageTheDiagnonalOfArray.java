package com.practice.array.twoDarray;

public class InterchageTheDiagnonalOfArray {
    public static void main(String[] args) {
        int c = 4;
        int r = 4;
        int count = 1;
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = count++;
            }
        }
        System.out.println("Previous Without Swap");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("After Swap");

        for (int i = 0; i < r; i++) {
            int temp = arr[i][i];
            arr[i][i] = arr[i][r - i - 1];
            arr[i][r - i - 1] = temp;
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
