package com.practice.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class DifferntWayToAddParanthesis_241 {

    private static List<Integer> solve(String s) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left = solve(s.substring(0, i));
                List<Integer> right = solve(s.substring(i + 1));
                for (int l : left) {
                    for (int r : right) {
                        if (c == '+') {
                            list.add(l + r);
                        } else if (c == '-') {
                            list.add(l - r);
                        } else {
                            list.add(l * r);
                        }
                    }
                }
            }
        }
        if (list.isEmpty()) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }

    private static List<Integer> diffWaysToCompute(String expression) {
        return solve(expression);
    }

    public static void main(String[] args) {
        String expression = "2-1-1";
        List<Integer> integerList = diffWaysToCompute(expression);
        System.out.println(integerList);
    }
}
