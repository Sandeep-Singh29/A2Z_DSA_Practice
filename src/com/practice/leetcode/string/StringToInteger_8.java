package com.practice.leetcode.string;


public class StringToInteger_8 {

    public static int myAtoi(String s) {
        s = s.strip();
        if (s.isEmpty()) {
            return 0;
        }
        int sign = s.charAt(0) == '-' ? -1 : 1;
        long ans = 0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            s = s.substring(1);
        }
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                break;
            }
            ans = ans * 10 + (c - '0');
            if (sign * ans <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (sign * ans >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        return sign * (int) ans;
    }

    public static void main(String[] args) {
        String s = "    -04     2   ";
        int i = myAtoi(s);
        System.out.println(i);
    }
}
