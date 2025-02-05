package com.practice.leetcode.string;

public class ReverseWord_151 {
    public static String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] s1 = s.trim().split(" ");
        for (int i = s1.length - 1; i >= 0; i--) {
            String data = s1[i].trim();
            if (!data.isEmpty()) {
                stringBuilder.append(data.trim()).append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        String s = "the sky    is blue";
//        String string = reverseWords(s);
//        System.out.println(string);
        String string = reverseW(s);
        System.out.println(string);
    }

    public static String reverseW(String s) {
        String res = "";
        String[] split = s.split(" +");
        for (int i = 0; i < split.length; i++) {
            res += " " + split[split.length - 1 - i];
        }
        return res.trim();
    }
}


