package com.practice.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArrayCountEqualK_560 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,-3, 1, 1, 1, 4, 2, -3 }; //
        int k = 3;
//        int count = subArrayCountBrute(arr, k);
//        System.out.println(count);
//        int count = subArrayCountBetter(arr, k);
//        System.out.println(count);
//        int count = subArrayCountBrute(arr, k);
//        System.out.println(count);
        int count = subArrayCountOptimal(arr, k);
        System.out.println(count);
    }

    private static int subArrayCountOptimal(int[] arr, int k) {
        int result = 0;
        int sum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int num : arr) {
            sum += num;
            // Check if (sum - k) is present in the map
            if (mp.containsKey(sum - k)) {
                result += mp.get(sum - k);
            }
            // Add or update the count of the current sum in the map
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return result;
    }

    private static int subArrayCountBetter(int[] arr, int k) {
        int count =0;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for (int j=i;j<arr.length;j++){
                    sum+=arr[j];
                    if(sum==k){
                        count++;
                    }
            }
        }

        return count;
    }

    private static int subArrayCountBrute(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                int sum = 0;
                for (int K = i; K <= j; K++)
                    sum += arr[K];
                if (sum == target) {
                    count++;
                }
            }
        }
        return count;
    }
}
