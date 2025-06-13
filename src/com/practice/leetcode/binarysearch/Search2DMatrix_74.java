package com.practice.leetcode.binarysearch;

/**
 * Author: Sandeep Singh
 * Date: 07/06/25
 */

public class Search2DMatrix_74 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int c = matrix[0].length - 1;
        int r = matrix.length;
        int i = 0;
        int j = c;
        while (i < r && j >= 0) {
            if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean searchMatrixUsingBinarySearch(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int left = 0;
        int right = r * c - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid / c][mid % c] > target) {
                right = mid - 1;
            } else if (matrix[mid / c][mid % c] < target) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[][] matrix = {{1}};
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 11;
        boolean searchMatrix = searchMatrix(matrix, target);
        System.out.println(searchMatrix);
        boolean usingBinarySearch = searchMatrixUsingBinarySearch(matrix, target);
        System.out.println(usingBinarySearch);
    }

}
