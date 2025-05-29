package com.practice.recrointerviewquestion;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 24/05/25
 */

public class SubarraySumEqualsK_560 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        int subarraySum = subArrayCountOptimal(nums, k);
        System.out.println(subarraySum);
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
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

}
