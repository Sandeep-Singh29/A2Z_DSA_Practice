package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: SANDEEP
 * Date: 05-10-2024
 */

public class LongestSubString_3 {

    private static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1) return n;
        int maxLen = 0;
        int i = 0, j = 0;
        Map<Character, Integer> map = new HashMap<>();// abcabcbb
        while (j < n) {
            char c = s.charAt(j);
            if (map.containsKey(c) && map.get(c) >= i) { // map.get(c)>=i check kar raha hai i stand kar raha hai start
                int len = j - i;                           // hamsa get(i)>= i hi rahaga jab map main contains hoga
                maxLen = Math.max(maxLen, len);
                while (s.charAt(i) != c) {
                    i++;
                }
                i++;
            }
            map.put(c, j);
            j++;
        }
        int len = j - i;
        maxLen = Math.max(maxLen, len);
        return maxLen;
    }

    private static int findLargestStrOptimalUsingMap(String str) {
        int max = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < str.length(); end++) {
            char c = str.charAt(end); // get charAt
            if (map.containsKey(c)) {  // map hai ch hai ki nahi ?
                if (start <= map.get(c)) { // check kar raha hai ki map.get(c) value start sa kam ur= hai mtlb str main match kat rha hai char
                    start = map.get(c) + 1; // to us time start ko hum jo map main char presnt hai uska value+1 main strat kar dega
                }                           // isa hum start aisa postiom main kar dega jaha pa bo value presnt nahi hogi jaha abhi hai
            }
            map.put(c, end);
            max = Math.max(max, end - start + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "sandeep";
        int substring = findLargestStrOptimalUsingMap(str);
        System.out.println(substring);
    }

}