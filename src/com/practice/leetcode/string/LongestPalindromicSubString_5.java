package com.practice.leetcode.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LongestPalindromicSubString_5 {

    public static void main(String[] args) {
        String str = "cbbd";
//        String string = longestPalindrome(str);
//        System.out.println(string);
//        String string = longestPalindrome2(str);
//        System.out.println(string);
        String string1 = longestPalindromeway3(str);
        System.out.println(string1);

    }

    public static String longestPalindromeway3(String s) {
        int maxLen = 1;
        String maxStr = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) {
                if (j - i > maxLen && checkPalindrom(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }
        return maxStr;
    }


    private static boolean checkPalindrom(String subStr, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (subStr.charAt(i) == subStr.charAt(j)) {
            return checkPalindrom(subStr, i + 1, j - 1);
        }
        return false;
    }

    public static String longestPalindrome(String s) {
        int maxLen = Integer.MIN_VALUE;
        int startPoint = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkPalindrom(s, i, j) == true) {
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        startPoint = i;
                    }
                }
            }
        }
        return s.substring(startPoint, startPoint + maxLen);
    }

    private static String longestPalindrome2(String str) {
        StringBuilder builder = new StringBuilder();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                StringBuilder subStr = builder.append(str.charAt(j));
                boolean isPaindrom = checkPalindrom(subStr.toString());
                if (isPaindrom) {
                    if (ans.length() < subStr.length()) {
                        ans = subStr.toString();
                    }
                }
            }
            builder = new StringBuilder();
        }
        return ans;
    }

    private static boolean checkPalindrom(String subStr) {
        int i = 0;
        int j = subStr.length() - 1;
        while (i <= j) {
            if (subStr.charAt(i) != subStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


