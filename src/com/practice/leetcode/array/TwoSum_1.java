package com.practice.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 8, 9};
        int target = 9;
//        int result[] = sumofArrayIndex(arr,target);
//        System.out.println(Arrays.toString(result));
//        int result[] = sumofArrayIndexway2(arr,target);
//        System.out.println(Arrays.toString(result));
        int result[] = sumofArrayIndexUSingGreedyByTwoPointer(arr, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sumofArrayIndexUSingGreedyByTwoPointer(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] < target) {
                left++;
            } else if (arr[left] + arr[right] > target) {
                right--;
            } else {
                return new int[]{left, right};
            }
        }
        return new int[]{-1, -1};
    }

    private static int[] sumofArrayIndexway2(int[] arr, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int findElement = target - val;
            if (!map.containsKey(findElement)) {
                map.put(val, i);
            } else {
                res[0] = map.get(findElement);
                res[1] = i;
                return res;
            }
        }
        return res;
    }

    private static int[] sumofArrayIndex(int[] arr, int target) {
        int[] result = new int[2];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
