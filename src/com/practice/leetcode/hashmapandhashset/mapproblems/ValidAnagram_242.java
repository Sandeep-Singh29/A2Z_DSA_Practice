package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: SANDEEP
 * Date: 04-10-2024
 */

public class ValidAnagram_242 {

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            m2.put(c, m2.getOrDefault(c, 0) + 1);
        }
        System.out.println(m1);
        System.out.println(m2);
        for (char key : m1.keySet()) {
            if (!m2.containsKey(key)) {
                return false;
            } else {
                int val1 = m1.get(key);
                int val2 = m2.get(key);
                if (val1 != val2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "aacc", s2 = "ccac";
        boolean anagram = isAnagram(s1, s2);
        System.out.println(anagram);
    }

}