package com.practice.leetcode.string;


public class StringToInteger_8 {

    public static int myAtoi(String s) {
        String str = s.replaceAll(" ", "");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) || (int) str.charAt(i) == 45) {
                builder.append(str.charAt(i));
            } else {

            }
        }
        System.out.println(builder);
        if (str.contains("-") && !str.startsWith("-")) {
            String[] split = builder.toString().split("-");
            int first = Integer.parseInt(split[0]);
            int second = Integer.parseInt(split[1]);
            int res = first - second;
            if (res < 0) {
                return 0;
            }
            return res;
        }
        return Integer.parseInt(builder.toString());
    }

    public static void main(String[] args) {
        String s = "1337c0d3";
        int i = myAtoi(s);
        System.out.println(i);
    }
}
