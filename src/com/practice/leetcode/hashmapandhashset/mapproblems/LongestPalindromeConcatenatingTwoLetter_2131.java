package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 05/06/25
 */

public class LongestPalindromeConcatenatingTwoLetter_2131 {

    public static int longestPalindrome(String[] words) {
        int result = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String str : words) {
            String reverse = str.charAt(1) + String.valueOf(str.charAt(0));
            if (map.getOrDefault(reverse, 0) > 0) {
                result += 4;
                map.put(reverse, map.getOrDefault(reverse, 0) - 1);
            } else {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            String word = m.getKey();
            int count = map.get(word);
            if (count > 0 && word.charAt(0) == word.charAt(1)) {
                result += 2;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"ab", "ty", "yt", "lc", "cl", "ab"};
        int longestPalindrome = longestPalindrome(words);
        System.out.println(longestPalindrome);
    }

}
