package com.practice.leetcode.binarysearch;

import java.util.LinkedList;
import java.util.List;

public class MissingKthPosition_1539 {

    private static int findKthPositive(int[] arr, int k) {
        List<Integer> list = new LinkedList<>();
        if (arr[0] != 1) {
            list.add(1);
            k--;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr[i - 1]; j < arr[i]; j++) {
                list.add(arr[j]);
            }
        }
        return list.get(k);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int kthPositive = findKthPositive(arr, k);
        System.out.println(kthPositive);

    }
}
