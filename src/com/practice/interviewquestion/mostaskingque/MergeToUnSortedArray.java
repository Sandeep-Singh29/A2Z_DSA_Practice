package com.practice.interviewquestion.mostaskingque;

import java.util.Arrays;

/**
 * Author: SANDEEP
 * Date: 30/12/24
 */

public class MergeToUnSortedArray {

    private static int[] mergeTwoArrayAndSorted(int[] a, int[] b) {

        // Create a new array using Arrays.copyOf
        int[] mergedArray = Arrays.copyOf(a, a.length + b.length);

        // Append the second array using System.arraycopy
        System.arraycopy(b, 0, mergedArray, a.length, b.length);
        Arrays.sort(mergedArray);
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 76, 3, 2, 7};
        int[] b = {8, 5, 9, 6, 4, 1};
        int[] result = mergeTwoArrayAndSorted(a, b);
        System.out.println(Arrays.toString(result));
    }


}
