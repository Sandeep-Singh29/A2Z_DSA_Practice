package com.practice.leetcode.string;

import java.util.*;

public class GroupAnagram_49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String sortStr = new String(str);
            if (!map.containsKey(sortStr)) {
                map.put(sortStr, new ArrayList<>());
            }
            map.get(sortStr).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        List<List<String>> lists = groupAnagrams(strs);
//        System.out.println(lists);
        List<List<String>> lists1 = groupAnagramsSecond(strs);
        System.out.println(lists1);
    }


    private static String generate(String s) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        StringBuilder newS = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                newS.append(String.valueOf((char) (i + 'a')).repeat(count[i]));
            }
        }
        return newS.toString();
    }

    public static List<List<String>> groupAnagramsSecond(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String newS = generate(s);
            if (!map.containsKey(newS)) {
                map.put(newS, new ArrayList<>());
            }
            map.get(newS).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
