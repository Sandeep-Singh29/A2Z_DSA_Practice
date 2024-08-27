package com.practice.leetcode.string;

import java.util.Arrays;

public class ValidAnagram_242 {

    public static boolean isAnagram(String s, String t) {
       /* char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);*/


        // Way 3...
//        int[] count = new int[26];
//        for (char ch : s.toCharArray()) {
//            count[ch - 'a']++;
//        }
//        for (char ch : t.toCharArray()) {
//            count[ch - 'a']--;
//        }
//        boolean allZeros = Arrays.stream(count).allMatch(element -> element == 0);
//        return allZeros;


        // Way ... 3
        String result = t;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(result.contains(String.valueOf(c))){
                String replace = result.replace(String.valueOf(c), "");
                result = replace;
            }else{
                return false;
            }
        }
        return result.isEmpty();
    }

    public static void main(String[] args) {
        String s = "aacc", t = "ccac";
        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);
    }
}
