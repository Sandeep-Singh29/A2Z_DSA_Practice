package com.practice.gfg.array;

import java.util.HashMap;

public class LargestSubarraySum0 {

    public static int maxLen(int arr[], int n) {
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        int maxi = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (mpp.get(sum) != null) {
                    maxi = Math.max(maxi, i - mpp.get(sum));
                } else {
                    mpp.put(sum, i);
                }
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = 8;
        int i = maxLen(arr, n);
        System.out.println(i);
    }
}
