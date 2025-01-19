package com.practice.leetcode.greedy;

import java.util.Arrays;

/**
 * Author: SANDEEP
 * Date: 31/10/24
 */

public class BoatsToSavePeople_881 {

    public static int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);
        int i = 0;
        int j = p.length - 1;
        int count = 0;
        while (i <= j) {
            if ((p[i] + p[j]) > limit) {
                j--;
                count++;
            } else if (p[i] + p[j] <= limit) {
                i++;
                j--;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        int rescueBoats = numRescueBoats(people, limit);
        System.out.println(rescueBoats);
    }

}
