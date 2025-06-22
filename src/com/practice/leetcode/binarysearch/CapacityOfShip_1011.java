package com.practice.leetcode.binarysearch;

public class CapacityOfShip_1011 {

    public static int shipWithinDays(int[] weights, int days) {
        int maxWeight = Integer.MIN_VALUE;
        int sumOfWeight = 0;
        for (int weight : weights) {
            sumOfWeight += weight;
            maxWeight = Math.max(weight, maxWeight);
        }
        int minCapacity = 0;
        while (maxWeight <= sumOfWeight) {
            int capacity = maxWeight+(sumOfWeight-maxWeight) / 2;
            int numberOfDays = findNumberOfDays(weights, capacity);
            if (numberOfDays <= days) {
                minCapacity = capacity;
                sumOfWeight = capacity - 1;
            } else {
                maxWeight = capacity + 1;
            }
        }
        return minCapacity;
    }

    public static int findNumberOfDays(int[] weight, int capacity) {
        int day = 1;
        int load = 0;
        int n = weight.length;
        for (int i = 0; i < n; i++) {
            if (weight[i] + load > capacity) {
                day++;
                load = weight[i];
            } else {
                load += weight[i];
            }
        }
        return day;
    }

    private static int leastWeightCapacityBrute(int[] weights, int d) {
        int maxi = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            maxi = Math.max(maxi, weights[i]);
        }
        for (int i = maxi; i <= sum; i++) {
            if (findNumberOfDays(weights, i) <= d) {
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int arr[] = {10,50,100,100,50,100,100,100}, days = 5;
        int shipped = shipWithinDays(arr, days);
        System.out.println(shipped);
        int leastWeightCapacity = leastWeightCapacityBrute(arr, days);
        System.out.println(leastWeightCapacity);
    }
}
