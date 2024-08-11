package com.practice.leetcode.array;

public class SetMatrixZero_73 {
    public static void main(String[] args) {
        int arr[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        System.out.println("---Before Array---");
        printArr(arr);
        System.out.println("---After Array set 0---");
//        int checkArr[][] = matrizZeroSet(arr);
//        printArr(checkArr);
        int checkArr[][] = matrizZeroSetBetter(arr);
        printArr(checkArr);
    }

    private static int[][] matrizZeroSetBetter(int[][] arr) {
        int rowCount = arr.length;
        int colCount = arr[0].length;
        int row[] = new int[rowCount];
        int col[] = new int[colCount];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                if(arr[i][j]==0){
                    col[j] = 1;
                    row[i] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] matrizZeroSet(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    markZeroRow(arr, i);
                    markZeroColumn(arr, j);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }

    private static void markZeroColumn(int[][] arr, int c) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][c] != 0) {
                arr[i][c] = -1;
            }
        }
    }

    private static void markZeroRow(int[][] arr, int r) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[r][i] != 0) {
                arr[r][i] = -1;
            }
        }
    }


}
