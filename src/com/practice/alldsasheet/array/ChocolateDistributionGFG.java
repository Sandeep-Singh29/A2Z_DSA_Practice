package com.practice.alldsasheet.array;

import java.util.Arrays;

/**
 * Author: Sandeep Singh
 * Date: 31/01/25
 */


public class ChocolateDistributionGFG {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        int ans = destributeChocolate(arr, m, arr.length);
        System.out.println(ans);
    }

    private static int destributeChocolate(int[] arr, int m, int n) {
        if (m == 0 || n == 0) return 0;

        if (m > n) return -1; // Agar students packets se zyada hain

        Arrays.sort(arr);

        // Step 2: Min difference find karna
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}
