package com.practice.leetcode.binarysearch;

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls_1552 {

    private static boolean possibleToPlace(int force, int[] position, int m) {
        int prev = position[0];
        int countBalls = 1;
        for (int i = 1; i < position.length; i++) {
            int curr = position[i];
            if (curr - prev >= force) {
                countBalls++;
                prev = curr;
            }
            if (countBalls == m) {
                break;
            }
        }
        return countBalls == m;
    }

    private static int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int minForce = 1;
        int maxForce = position[n - 1] - position[0];
        int result = 0;
        while (minForce <= maxForce) {
            int midForce = minForce + (maxForce - minForce) / 2;
            if (possibleToPlace(midForce, position, m)) {
                result = midForce;
                minForce = midForce + 1;
            } else {
                maxForce = midForce - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 7}, m = 3;
        int maxDistance = maxDistance(arr, m);
        System.out.println(maxDistance);
    }
}
