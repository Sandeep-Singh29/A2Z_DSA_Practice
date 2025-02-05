package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class LongestSubArrayWithSumK {

    private static int lenOfLongSubarr(int num[], int N, int K) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum = sum + num[j];
                if (sum <= K) {
                    li.add(num[j]);
                } else {
                    lists.add(li);
                    li = new ArrayList<>();
                    break;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < lists.size(); i++) {
            max = Math.max(max, lists.get(i).size());
        }
        return max;
    }

    public static int getLongestSubarrayway2(int[] a, long k) {
        int n = a.length;
        int len = 0;
        for (int i = 0; i < n; i++) {
            long s = 0;
            for (int j = i; j < n; j++) {
                s += a[j];
                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    public static int getLongestSubarray(int[] a, long k) {
        int n = a.length;
        int left = 0, right = 0;
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n)
                sum += a[right];
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 0, 0, -1, -1, 1, 9}, k = 14;
//        int i = lenOfLongSubarr(arr, arr.length, k);
//        System.out.println(i);
        int longestSubarray = getLongestSubarrayway2(arr, k);
//        System.out.println(longestSubarray);
        int longest = getLongestSubarray(arr, k);
        System.out.println(longest);

    }
}
