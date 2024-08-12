package com.practice.leetcode.array;

public class RotateImage_48 {

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int rotated[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotated[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
    }
}

/*int r = row - 1;
        int result[][] = new int[col][row];
        for (int i = 0; i < col; i++) {
            int c = 0;
            for (int j = 0; j < row; j++) {
                result[c][r] = arr[i][j];
                c++;
            }
            r--;
        }
        return result;  */
