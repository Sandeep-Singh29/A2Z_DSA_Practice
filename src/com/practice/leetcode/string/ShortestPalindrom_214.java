package com.practice.leetcode.string;


public class ShortestPalindrom_214 {

    private static String shortestPalindrome(String s) {
        int length = s.length();
        String reversedString = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < length; i++) {
            String orginal =  s.substring(0, length - i);
            String rev = reversedString.substring(i);
            if (orginal.equals(rev)) {
                String revStr = reversedString.substring(0, i);
                return new StringBuilder(revStr).append(s).toString();
            }
        }
        return "";
    }


    public static void main(String[] args) {
        String str = "caba";
        String palindrome = shortestPalindrome(str);
        System.out.println(palindrome);
    }
}
