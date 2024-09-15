package com.practice.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStrWithVowel_1371 {

    private static int findTheLongestSubstring(String s) {
        Map<String, Integer> map = new HashMap<>();
        int vowelCount[] = new int[5];
        String current = "00000";
        map.put(current, -1);
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                vowelCount[0] = (vowelCount[0]^1);  // in xor if v any number appear even time than 0
//                vowelCount[0] = (vowelCount[0] + 1) % 2;  // using mode  in mode if all number divided than return 0
            } else if (c == 'e') {
                vowelCount[1] = (vowelCount[1] + 1) % 2;
            } else if (c == 'i') {
                vowelCount[2] = (vowelCount[2] + 1) % 2;
            } else if (c == 'o') {
                vowelCount[3] = (vowelCount[3] + 1) % 2;
            } else if (c == 'u') {
                vowelCount[4] = (vowelCount[4] + 1) % 2;
            }
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < vowelCount.length; j++) {
                builder.append(vowelCount[j]);
            }

            current = builder.toString();
            if (map.containsKey(current)) {
                maxLength = Math.max(maxLength, i - map.get(current));
            } else {
                map.put(current, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "eeleeee";
        int theLongestSubstring = findTheLongestSubstring(str);
        System.out.println(theLongestSubstring);
    }
}


