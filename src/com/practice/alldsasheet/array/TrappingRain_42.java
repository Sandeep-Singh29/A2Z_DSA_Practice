package com.practice.alldsasheet.array;

/**
 * Author: Sandeep Singh
 * Date: 04/02/25
 */

public class TrappingRain_42 {

    public static int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(height[i], max);
            leftMax[i] = max;
        }

        max = 0;
        int[] rightMax = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(height[i], max);
            rightMax[i] = max;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int minOfLeftAndRight = Math.min(leftMax[i], rightMax[i]);
            ans += minOfLeftAndRight - height[i];
        }
        return ans;
    }


    private static int rainTrappingOptimal(int[] height) {
        int len = height.length;
        int leftMax = 0;
        int rightMax = 0;
        int l = 0;
        int r = len - 1;
        int ans = 0;
        while (l < r) {
            if (height[l] > leftMax) {
                leftMax = Math.max(height[l], leftMax);
            }
            if (height[r] > rightMax) {
                rightMax = Math.max(height[r], rightMax);
            }
            if (leftMax < rightMax) {
                ans = ans + leftMax - height[l];
                l++;
            } else {
                ans = ans + rightMax-height[r];
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        int trap = trap(arr);
//        System.out.println(trap);
        int optimal = rainTrappingOptimal(arr);
        System.out.println(optimal);
    }
}
