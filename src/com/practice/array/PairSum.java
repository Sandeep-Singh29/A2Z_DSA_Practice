package com.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSum {

    public static List<int[]> pairSum(int[] arr, int s) {
        List<int[]> list = new ArrayList<>();
        int size = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int sum = arr[i] + arr[j];
                if (sum == s) {
                    if (arr[i] < arr[j]) {
                        list.add(new int[]{arr[i], arr[j]});
                    } else {
                        list.add(new int[]{arr[j], arr[i]});
                    }
                }
            }
        }
//        list.sort((a, b) -> {
//            if (]a[0 != b[0]) {
//                return Integer.compare(a[0], b[0]);
//            }
//            return Integer.compare(a[1], b[1]);
//        });
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {2, -3, 3 ,3, -2};
        int sum = 0;
        List<int[]> data = pairSum(arr, sum);
        for (int[] pair : data) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
