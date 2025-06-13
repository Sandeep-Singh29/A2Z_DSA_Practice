package com.practice.leetcode.binarysearch;

/**
 * Author: Sandeep Singh
 * Date: 13/06/25
 */

public class Search2DMatrixII_240 {

    public static boolean searchMatrixApproach1(int[][] matrix, int target) {
        int row = matrix.length;
        for (int i = 0; i < row; i++) {
            int index = binarySearchFoundTarget(matrix[i], target);
            if (index != -1) {
                return true;
            }
        }
        return false;
    }

    private static int binarySearchFoundTarget(int[] matrix, int target) {
        int result = -1;
        int l = 0;
        int r = matrix.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (matrix[mid] == target) {
                result = mid;
                return result;
            } else if (matrix[mid] > target) { // 1, 4, 7, 11, 15
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }


    public static boolean searchMatrixOptimal(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;
        int n = matrix.length;
        while (row < n && column >= 0) {
            if (matrix[row][column] == target) {
                return true;
            } else if (matrix[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 20;
        boolean approach1 = searchMatrixApproach1(matrix, target);
        System.out.println(approach1);
        boolean searchMatrixOptimal = searchMatrixOptimal(matrix, target);
        System.out.println(searchMatrixOptimal);
    }

}
