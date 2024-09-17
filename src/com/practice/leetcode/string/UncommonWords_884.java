package com.practice.leetcode.string;

import java.util.*;

public class UncommonWords_884 {

    private static String[] uncommonFromSentences(String s1, String s2) {
        List<String> res = new ArrayList<>();
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String string1 : str1) {
            map.put(string1, map.getOrDefault(string1, 0) + 1);
        }
        for (String string2 : str2) {
            map.put(string2, map.getOrDefault(string2, 0) + 1);
        }
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                res.add(m.getKey());
            }
        }
        return res.toArray(new String[res.size()]);
    }

    public static void main(String[] args) {
        String s1 = "apple apple", s2 = "banana"; //"this apple is sweet", s2 = "this apple is sour"
        String[] strings = uncommonFromSentences(s1, s2);
        System.out.println(Arrays.toString(strings));
    }
}
