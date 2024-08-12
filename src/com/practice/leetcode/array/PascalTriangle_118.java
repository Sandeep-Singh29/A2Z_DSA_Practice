package com.practice.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_118 {
    public static void main(String[] args) {
        int nums = 5;
        List<List<Integer>> list = pascalTriangle(nums);
        System.out.println(list);
    }


    public static List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> previous = result.get(i - 1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 1; j < i; j++) {
                curr.add(previous.get(j - 1) + previous.get(j));
            }
            curr.add(1);
            result.add(curr);
        }

        return result;
    }
}
