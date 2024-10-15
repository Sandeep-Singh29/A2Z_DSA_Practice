package com.practice.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: SANDEEP
 * Date: 15/10/24
 */

public class SeparateWhiteAndBlackBalls_2938 {

    private static long minimumSteps(String s) {
        List<Integer> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            int i = Integer.parseInt(String.valueOf(c));
            list.add(i);
        }
        int r = list.size() - 1;
        int steps = 0;
        System.out.println(list);
        while (r >= 0) {

        }

        return steps;
    }

    public static void main(String[] args) {
        String s = "11000111";
        long minimumSteps = minimumSteps(s);
        System.out.println(minimumSteps);
    }

}
