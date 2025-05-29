package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Author: Sandeep Singh
 * Date: 27/05/25
 */

public class WordPattern_290 {

    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat fish";
        boolean wordPattern = wordPattern(pattern, s);
        System.out.println(wordPattern);
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] wordArray = s.split(" ");
        if(wordArray.length!=pattern.length()) return false;
        Map<String, Character> wordEntryMap = new HashMap<>();
        Set<Character> patternPresentSet = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            String word = wordArray[i];
            char ch = pattern.charAt(i);
            if (!wordEntryMap.containsKey(word)) {
                if (patternPresentSet.contains(ch)) {
                    return false;
                }
                wordEntryMap.put(word, ch);
                patternPresentSet.add(ch);
            } else if (wordEntryMap.get(word) != ch) {
                return false;
            }
        }
        return true;
    }

    public boolean wordPatternApproch2(String pattern, String s) {
        Map<Character, Integer> charToIndex = new HashMap<>();
        Map<String, Integer> wordToIndex = new HashMap<>();

        String[] words = s.split(" ");
        int n = pattern.length();

        if (words.length != n) return false;

        for (int i = 0; i < n; i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            int charIndex = charToIndex.getOrDefault(c, 0);
            int wordIndex = wordToIndex.getOrDefault(word, 0);

            if (charIndex != wordIndex) return false;

            // Use i+1 to differentiate from default value 0 for first-time insertion
            charToIndex.put(c, i + 1);
            wordToIndex.put(word, i + 1);
        }

        return true;
    }
}
