package com.practice.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString_205 {

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> check = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (check.containsKey(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
            if (!check.containsKey(t.charAt(i))) {
                check.put(t.charAt(i), s.charAt(i));
            }
            if (map.containsKey(s.charAt(i))) {
                String c = map.get(s.charAt(i)).toString();
                if (!c.equals(String.valueOf(t.charAt(i)))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isIsomorphic2(String s, String t) {
        Map<Character, Character> mp1 = new HashMap<>();
        Map<Character, Character> mp2 = new HashMap<>();
        int m = s.length();
        for (int i = 0; i < m; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if ((mp1.containsKey(ch1) && mp1.get(ch1) != ch2) || (mp2.containsKey(ch2) && mp2.get(ch2) != ch1)) {
                return false;
            }
            mp1.put(ch1, ch2);
            mp2.put(ch2, ch1);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "paper", t = "title";
        boolean isomorphic = isIsomorphic(s, t);
//        System.out.println(isomorphic);
        boolean isomorphic2 = isIsomorphic2(s, t);
        System.out.println(isomorphic2);
    }
}
