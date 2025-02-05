package com.practice.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class GreatestLetter_2309 {

    public static String greatestLetter(String s) {
        Set<Character> ss = new HashSet<>();
        for (char c : s.toCharArray()) {
            ss.add(c);
        }
        for (char a = 'Z'; a >= 'A'; --a) {
            if (ss.contains(a) && ss.contains((char) (a + 32))) {
                return String.valueOf(a);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "lEeTcOdE";
        String string = greatestLetter(s);
        System.out.println(string);
    }

}
