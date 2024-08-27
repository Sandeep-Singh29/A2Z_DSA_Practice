package com.practice.leetcode.string;

import java.util.Arrays;

public class ValidAnagram_242 {

    public static boolean isAnagram(String s, String t) {
       /* char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);*/
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            count[ch - 'a']--;
        }
        boolean allZeros = Arrays.stream(count).allMatch(element -> element == 0);
        return allZeros;
    }

    public static void main(String[] args) {
        String s = "rat", t = "car";
        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);
    }
}
