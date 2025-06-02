package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 01/06/25
 */

public class FindNumberOfDistinctColorsAmongTheBall_3160 {

    public static int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];
        Map<Integer, Integer> colormp = new HashMap<>(); // color -> count
        Map<Integer, Integer> ballmp = new HashMap<>(); // ball -> color
        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];
            if (ballmp.containsKey(ball)) { // already colored ball
                int prevColor = ballmp.get(ball);
                colormp.put(prevColor, colormp.get(prevColor) - 1);
                if (colormp.get(prevColor) == 0) {
                    colormp.remove(prevColor);
                }
            }
            ballmp.put(ball, color);
            colormp.put(color, colormp.getOrDefault(color, 0) + 1);
            result[i] = colormp.size();
        }
        return result;
    }

    public static int[] queryResultsGiveMTE(int limit, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];
        Map<Integer, Integer> colormp = new HashMap<>(); // color -> count
        int[] ballArr = new int[limit + 1]; // ball[i] = x; ith ball has x color
        Arrays.fill(ballArr, -1);

        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            if (ballArr[ball] != -1) { // already colored ball
                int prevColor = ballArr[ball];
                colormp.put(prevColor, colormp.get(prevColor) - 1);

                if (colormp.get(prevColor) == 0) {
                    colormp.remove(prevColor);
                }
            }
            ballArr[ball] = color;
            colormp.put(color, colormp.getOrDefault(color, 0) + 1);
            result[i] = colormp.size();
        }
        return result;
    }

    public static void main(String[] args) {
       int  limit = 4;
       int [][]queries = {{0,1},{1,2},{2,2},{1,4},{2,5}};
        int[] ints = queryResults(limit, queries);
        System.out.println(Arrays.toString(ints));
        int[] queryResultsGiveMTE = queryResultsGiveMTE(limit, queries);
        System.out.println(Arrays.toString(queryResultsGiveMTE));
    }


}
