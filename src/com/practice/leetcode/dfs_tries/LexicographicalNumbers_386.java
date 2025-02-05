package com.practice.leetcode.dfs_tries;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers_386 {

    private static List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for (int num = 1; num <= 9; num++) {
            findLexograpicalNumber(num, n, res);
        }
        return res;
    }

    private static void findLexograpicalNumber(int currNum, int n, List<Integer> res) {
        if (currNum > n) {
            return;
        }
        res.add(currNum);
        for (int append = 0; append <= 9; append++) {
            int insertNum = currNum * 10 + append;
            if (insertNum > n) {
                return;
            }
            findLexograpicalNumber(insertNum, n, res);
        }
    }

    public static void main(String[] args) {
        int n = 13;
        List<Integer> list = lexicalOrder(n);
        System.out.println(list);
    }
}
