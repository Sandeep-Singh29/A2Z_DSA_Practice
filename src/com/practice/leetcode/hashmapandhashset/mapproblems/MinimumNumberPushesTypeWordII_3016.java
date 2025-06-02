package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 30/05/25
 */

public class MinimumNumberPushesTypeWordII_3016 {

    public static int minimumPushesWay2(String word) {
        int[] mp = new int[26]; // frequency array

        // Generic solution
        for (char ch : word.toCharArray()) {
            mp[ch - 'a']++; // Mentioned in the question, all letters will be distinct
        }

        // Descending order of frequency
        Integer[] array = Arrays.stream(mp).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += array[i] * ((i / 8) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String word = "aabbccddeeffgghhiiiiii";
        int pushesWay2 = minimumPushesWay2(word);
        System.out.println(pushesWay2);
        int[] arr = {1,2,56,7,8,2,4};
        Integer[] array = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
    }

}
