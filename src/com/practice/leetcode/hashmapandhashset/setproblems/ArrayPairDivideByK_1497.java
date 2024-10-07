package com.practice.leetcode.hashmapandhashset.setproblems;

import java.util.*;

/**
 * Author: SANDEEP
 * Date: 05-10-2024
 */

public class ArrayPairDivideByK_1497 {

    private static boolean canArrange(int[] arr, int k) {
        List<List<Integer>> set = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int i1 = ((arr[i] % k) + k) % k;
                int j1 = ((arr[i] % k) + k) % k;
                int pairSum = i1 + j1;
                if ((pairSum) % k == 0) {
                    set.add(Arrays.asList(arr[i], arr[j]));
                }
            }
        }
        System.out.println(set);
        int half = n / 2;
        return set.size() >= half;
    }

    private static boolean canArrangeCorrect(int[] arr, int k) {

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 1, -2, 2, -3, 3, -4, 4}; // -1 4 >> 1 2   >> 2 4 >> -3 3 >>
        int k = 3;
        boolean arrange = canArrange(arr, k);
        System.out.println(arrange);
    }

}