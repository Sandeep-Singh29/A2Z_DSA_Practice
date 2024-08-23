package com.practice.leetcode.string;

import java.util.Arrays;

public class LongestCommonPrefix_14 {

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str = strs[0];

        return "";
    }

    public static void main(String[] args) {
        String strs[] = {"flower", "flow", "flight"};
        String string = longestCommonPrefix(strs);
        System.out.println(string);
    }
}
