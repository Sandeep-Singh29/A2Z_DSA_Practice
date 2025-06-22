package com.practice.leetcode.binarysearch;

import java.util.Arrays;

public class KokoEatingBanana_875 {

    public static boolean canEatAll(int[] piles, int givenHour, int h) {
        int totalTimeTaken = 0;
        for (int x : piles) {
            totalTimeTaken += x / givenHour;
            if (x % givenHour != 0)
                totalTimeTaken++;
        }
        return totalTimeTaken <= h;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        while (l < r) {
            int perHours = l + (r - l) / 2;
            if (canEatAll(piles, perHours, h)) {
                r = perHours;
            } else {
                l = perHours + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int arr[] = {30, 11, 23, 4, 20};
        int hour = 5;
        int min = minEatingSpeed(arr, hour);
        System.out.println(min);

    }
}
