package com.practice.leetcode.binarysearch;

public class CapacityOfShip_1011 {

    private static int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            int numberOfDays = findDays(weights, mid);
            if (numberOfDays <= days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isShiping(int[] weights, int capacity, int days) {
        int load = 0;
        int totalConsumeDays = 1;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > capacity) {
                totalConsumeDays++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return totalConsumeDays <= days;
    }


    private static int leastWeightCapacityBrute(int[] weights, int d) {
        int maxi = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            maxi = Math.max(maxi, weights[i]);
        }
        for (int i = maxi; i <= sum; i++) {
            if (findDays(weights, i) <= d) {
                return i;
            }
        }
        return -1;
    }

    private static int findDays(int[] weights, int cap) {
        int days = 1; //First day.
        int load = 0;
        int n = weights.length; //size of array.
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1; //move to next day
                load = weights[i]; //load the weight.
            } else {
                //load the weight on the same day.
                load += weights[i];
            }
        }
        return days;
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 2, 4, 1, 4}, days = 3;
        int shipped = shipWithinDays(arr, days);
        System.out.println(shipped);
        int leastWeightCapacity = leastWeightCapacityBrute(arr, days);
        System.out.println(leastWeightCapacity);
    }
}
