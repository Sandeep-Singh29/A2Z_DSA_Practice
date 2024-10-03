package com.practice.leetcode.hashmapandhashset;

import java.util.HashSet;

/**
 * Author: SANDEEP
 * Date: 03/10/24
 */

public class FindMaximunPair_2744 {

    private static int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        for (String v : words) {
            StringBuilder builder = new StringBuilder(v);
            String rev = builder.reverse().toString();
            if(!set.contains(rev)){
                set.add(v);
            }
        }
        int sizeArray = words.length;
        return sizeArray - set.size();
    }

    public static void main(String[] args) {
        String[] words = {"ab","ba","cc"};  // cd dc ac ca
        int stringPairs = maximumNumberOfStringPairs(words);
        System.out.println(stringPairs);
    }
}
