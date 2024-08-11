package com.practice.leetcode.array;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveArray_128 {
    public static void main(String[] args) {
        int arr[] = {5, 6, 1, 103, 100, 3, 2, 101, 102, 4};
//        int res = longestConsectiveArr(arr);
//        System.out.println(res);
        int res = longestSuccessiveElements(arr);
        System.out.println(res);
    }

    private static int longestConsectiveArr(int[] a) {
        int n = a.length;
        if (n == 0) return 0;
        Arrays.sort(a);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] - 1 == lastSmaller) {
                cnt += 1;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = a[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }


    public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        if (n == 0) return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        for (int it : set) {
            if (!set.contains(it - 1)) {
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
