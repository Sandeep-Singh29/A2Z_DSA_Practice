package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 27/05/25
 */

public class EqualRowAndColumnPairs_2352 {

    public static int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;
        for (int c = 0; c < n; c++) {
            for (int r = 0; r < n; r++) {
                boolean isEquals = true;
                for (int i = 0; i < n; i++) {
                    if (grid[i][c] != grid[r][i]) {
                        isEquals = false;
                    }
                }
                if (isEquals) {
                    count++;
                }
            }
        }
        return count;
    }


    public static int equalPairsOptimal(int[][] grid) {
        int count = 0;
        int n = grid.length;
        Map<List<Integer>, Integer> map = new HashMap<>();
        // Iterate over Row and add into Map List of element as a Key and Frequency Count
        for (int r = 0; r < n; r++) {
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                list.add(grid[r][i]); // get element of row
            }
            map.put(list, map.getOrDefault(list, 0) + 1); // insert list into map
        }
        // Iterate over getting Column element
        for (int c = 0; c < n; c++) {
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                list.add(grid[i][c]); // get element of column
            }
            count += map.getOrDefault(list, 0);// if list of key present than value get else 0 return
        }
        return count;
    }


    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}};
        int equalPairsOptimal = equalPairsOptimal(grid);
        System.out.println(equalPairsOptimal);
        int equalPairs = equalPairs(grid);
        System.out.println(equalPairs);
    }

}
