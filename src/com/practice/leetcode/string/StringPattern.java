package com.practice.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: SANDEEP
 * Date: 26/12/24
 */

public class StringPattern {

    private static boolean isValidPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        map.put('a', "dog");
        map.put('b', "cat");
        map.put('c', "hat");

        String[] animalStr = str.split(" ");
        char[] charArray = pattern.toCharArray();
        for (int i = 0; i < animalStr.length; i++) {
            String string = map.get(charArray[i]);
            if(!string.equals(animalStr[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abab";
        String str = "dog cat cat cat";
        boolean ans = isValidPattern(pattern, str);
        System.out.println(ans);
    }

}
