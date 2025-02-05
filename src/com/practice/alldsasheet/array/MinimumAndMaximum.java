package com.practice.alldsasheet.array;

import java.util.Arrays;

/**
 * Author: Sandeep Singh
 * Date: 31/01/25
 */

public class MinimumAndMaximum {
    public static void main(String[] args) {
        int[] input = {3, 2, 5, 24, 2, 54, 4, 35};
        int[] result = minAndMax(input);
        System.out.println(Arrays.toString(result));
    }

    private static int[] minAndMax(int[] input) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int v : input) {
            min = Math.min(v, min);
            max = Math.max(v, max);
        }
        return new int[]{min, max};
    }
}
