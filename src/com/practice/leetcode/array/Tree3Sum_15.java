package com.practice.leetcode.array;

import java.util.*;

public class Tree3Sum_15 {

    public static List<List<Integer>> threeSumBrute(int[] arr) {
        int n = arr.length;
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>(st);
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};  // -4 -1 -1  0  1 2
        List<List<Integer>> list = threeSumBrute(arr);
        System.out.println(list);
    }
}
