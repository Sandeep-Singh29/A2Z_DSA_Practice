package com.practice.leetcode.recursion;

import java.util.*;

public class ExtraCharInString_2707 {


    private static int minExtraChar(String s, String[] dictionary) {
        List<String> list = Arrays.asList(dictionary);
        list.sort(Comparator.comparingInt(String::length));
        List<String> list1 = list.reversed().stream().distinct().toList();
        String ans = s;
        ans = replaceStr(ans, list1);
        return ans.length();
    }

    private static String replaceStr(String ans, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            ans = ans.replaceAll(string, "");
        }
        return ans;
    }


    public static void main(String[] args) {
        String s = "dwmodizxvvbosxxw"; //  dxbsxxw
        String[] dictionary = {"ox", "lb", "diz", "gu", "v", "ksv", "o", "nuq", "r", "txhe", "e", "wmo", "cehy", "tskz", "ds", "kzbu"};
        int minExtraChar = minExtraChar(s, dictionary);
        System.out.println(minExtraChar);
//        int minExtraChar2 = minExtraCharway2(s, dictionary);
//        System.out.println(minExtraChar2);
    }

    private static int minExtraCharway2(String s, String[] dictionary) {
        int n = s.length();
        Set<String> st = new HashSet<>(Arrays.asList(dictionary));
        int[] t = new int[n + 1]; // DP array
        // t[i] = min extra characters in s from index i to index n-1
        // we want to return t[0]
        for (int i = n - 1; i >= 0; i--) {
            t[i] = 1 + t[i + 1]; // skipping the ith character

            for (int j = i; j < n; j++) {
                String curr = s.substring(i, j + 1);
                if (st.contains(curr)) {
                    t[i] = Math.min(t[i], t[j + 1]); // solve(j+1)
                }
            }
        }

        return t[0];
    }
}
