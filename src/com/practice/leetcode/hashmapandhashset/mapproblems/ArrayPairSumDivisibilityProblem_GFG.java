package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Sandeep Singh
 * Date: 29/05/25
 */

public class ArrayPairSumDivisibilityProblem_GFG {

    public static void main(String[] args) {
        int[] nums = {9, 5, 7, 3};
        int k = 6;
        boolean isPairs = pairSumDivisibility(nums, k);
        System.out.println(isPairs);
        boolean approach1 = canPairApproach1(nums,k);
        System.out.println(approach1);
    }

    private static boolean pairSumDivisibility(int[] nums, int k) {
        int n = nums.length;
        if (n % 2 == 1) return false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int r1 = nums[i] % k;
            int r2 = k - r1;
            if (set.contains(r2)) {
                set.remove(r2);
            } else if (r1 == 0 && set.contains(r1)) {
                set.remove(0);
            } else {
                set.add(r1);
            }
        }
        return set.isEmpty();
    }

    public static boolean canPairApproach1(int[] nums, int k) {
        int n = nums.length;
        // Mark pairs as used to avoid repetition
        boolean[] used = new boolean[n];
        Arrays.fill(used, false);
        for (int i = 0; i < n; i++) {
            if (used[i]) {
                continue; // Skip if this element is already used in a pair
            }
            boolean foundPair = false;
            for (int j = i + 1; j < n; j++) {
                if (!used[j] && (nums[i] + nums[j]) % k == 0) {
                    used[i] = true;
                    used[j] = true;
                    foundPair = true;
                    break;
                }
            }
            if (!foundPair) {
                return false; // No pair found for the current element
            }
        }
        return true;
    }

}
