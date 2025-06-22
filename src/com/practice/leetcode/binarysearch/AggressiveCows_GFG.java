package com.practice.leetcode.binarysearch;

import java.util.Arrays;

/**
 * Author: Sandeep Singh
 * Date: 16/06/25
 */

public class AggressiveCows_GFG {

    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int cows = 3;
        int aggressiveCows = aggressiveCows(stalls, cows);
        System.out.println(aggressiveCows);
    }

    public static int aggressiveCows(int[] stalls, int cows) {
        int ans = -1;
        int n = stalls.length;
        Arrays.sort(stalls);
        int l = 1;
        int r = stalls[n - 1] - stalls[0];
        while (l <= r) {
            int cowPlaceDistance = l + (r - l) / 2;
            if (isAggressiveCow(stalls, cowPlaceDistance, cows)) {
                ans = cowPlaceDistance;
                l = cowPlaceDistance + 1;
            } else {
                r = cowPlaceDistance - 1;
            }
        }
        return ans;
    }

    private static boolean isAggressiveCow(int[] stalls, int cowPlaceDistance, int cows) {
        int countOfCows = 1;
        int lastDistancePlaceCow = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastDistancePlaceCow >= cowPlaceDistance) {
                countOfCows++;
                lastDistancePlaceCow = stalls[i];
            }
            if(countOfCows >= cows){
                return true;
            }
        }
        return false;
    }
}
