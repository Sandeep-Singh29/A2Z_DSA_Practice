package com.practice.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int col = arr.length;
        int row = arr[0].length;
        printArra(arr, col, row);
//        int res[][] = spiralMatrix(arr, col, row);
//        printArra(res, col, row);
        List<Integer> list = spiralOrder(arr);
        System.out.println(list);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int down = m - 1;
        int left = 0;
        int right = n - 1;

        int id = 0;
        // id
        // 0   -> left to right
        // 1   -> top to down
        // 2   -> right to left
        // 3   -> down to top

        while (top <= down && left <= right) {
            // left to right
            if (id == 0) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            }

            // top to down
            if (id == 1) {
                for (int i = top; i <= down; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }

            // right to left
            if (id == 2) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[down][i]);
                }
                down--;
            }

            // down to top
            if (id == 3) {
                for (int i = down; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

            id = (id + 1) % 4;
        }

        return result;
    }


    private static void printArra(int[][] res, int col, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] spiralMatrix(int[][] arr, int col, int row) {
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
        int n = arr.length;
        int rotated[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = arr[i][j];
            }
        }
        return rotated;
    }
}
