package com.practice.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2_119 {

    public static List<List<Integer>> generate(int row) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        res.add(first);
        for (int i = 1; i <= row; i++) {
            List<Integer> pre = res.get(i - 1);
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int j = 1; j < i; j++) {
                cur.add(pre.get(j - 1) + pre.get(j));
            }
            cur.add(1);
            res.add(cur);
        }
        return res;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = generate(rowIndex);
        return res.get(rowIndex);
    }

    public static List<Integer> getRowOnly(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            List<Integer> curr = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    curr.add(1);
                } else {
                    curr.add(prev.get(j) + prev.get(j - 1));
                }
            }
            prev = curr;
        }
        return prev;
    }

    public static void main(String[] args) {
        int row = 3;
//        List<Integer> list = getRow(row);
//        System.out.println(list);
        List<Integer> list = getRowOnly(row);
        System.out.println(list);
    }
}
