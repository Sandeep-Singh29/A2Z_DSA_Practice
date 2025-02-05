package com.practice.leetcode.binarysearch;

public class KokoEatingBanana_875 {

    private static int minEatingSpeed(int[] piles, int h) {
        int high = 0;
        for (int i = 0; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }
        int low = 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canEatBanana(piles, mid, h)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
//        return low;
    }

    private static boolean canEatBanana(int[] piles, int givenHours, int h) {
        int actualHours = 0;
        for (int v : piles) {
            actualHours += v / givenHours;
            if (v % givenHours != 0) {
                actualHours++;
            }
        }
        return actualHours <= h;
    }

    public static void main(String[] args) {
        int arr[] = {30, 11, 23, 4, 20};
        int hour = 5;
        int min = minEatingSpeed(arr, hour);
        System.out.println(min);

    }
}
