package com.practice.recrointerviewquestion;

import java.util.HashMap;

/**
 * Author: Sandeep Singh
 * Date: 23/05/25
 */

public class MaximumLengthSubstringWithTwoOccurrences_3090 {

    public static void main(String[] args) {
        String s = "aaaa";
        int lengthSubstring = maximumLengthSubstring(s);
        System.out.println(lengthSubstring);
    }

    public static int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while (map.get(ch) > 2) {
                int leftVal = map.get(s.charAt(left)) - 1;
                map.put(s.charAt(left), leftVal);
                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
