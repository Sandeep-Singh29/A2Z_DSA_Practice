package com.practice.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("CD", 400);
        map.put("XC", 90);
        map.put("XL", 40);
        map.put("IV", 4);
        map.put("IX", 9);
        int num = 0;
        for (char c : s.toCharArray()) {
            if (map.containsKey(String.valueOf(c))) {
               num+=map.get(String.valueOf(c));
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int i = romanToInt(s);
        System.out.println(i);
    }
}
