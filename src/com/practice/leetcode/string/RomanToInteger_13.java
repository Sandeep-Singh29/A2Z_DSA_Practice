package com.practice.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            int first = map.get(s.charAt(i - 1));
            int second = map.get(s.charAt(i));
            if (first < second) {
                result -= map.get(s.charAt(i - 1));
            } else {
                result += map.get(s.charAt(i - 1));
            }
        }
        result += map.get(s.charAt(s.length() - 1));
        return result;
    }

    public static void main(String[] args) {
        String s = "LVIII";
        int i = romanToInt(s);
        System.out.println(i);

    }
}
