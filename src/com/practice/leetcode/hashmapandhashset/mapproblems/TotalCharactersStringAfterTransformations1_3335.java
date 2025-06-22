package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 04/06/25
 */

public class TotalCharactersStringAfterTransformations1_3335 {

    public static int lengthAfterTransformationsBruteForce(String s, int t) {
        while (t > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 97 && ch <= 121) {
                    ch++;
                    sb.append(ch);
                } else if (ch=='z') {
                    sb.append("ab");
                }
            }
            s = sb.toString();
            t--;
        }
        return s.length();
    }

    public static int lengthAfterTransformationsUsingMap(String s, int t) {
        int M = 1_000_000_007;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1); // a-1 , b-1 , z-2 , k-1
        }
        while (t > 0) {
            Map<Character, Integer> temp = new HashMap<>();
            for (Map.Entry<Character, Integer> m : map.entrySet()) {
                int ch = m.getKey();
                int val = m.getValue();
                if(ch!='z'){
                    ch++;
                    temp.put((char)ch,val);
                }else{
                    temp.put('a',temp.getOrDefault('a',0)+val%M);
                    temp.put('b',temp.getOrDefault('b',0)+val%M);
                }
            }
            map.clear();;
            map = temp;
            t--;
        }
        int result =0;
        for(int val : map.values()){
            result+=val;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "azbk";
        int t = 1;
        int afterTransformations = lengthAfterTransformationsBruteForce(s, t);
        System.out.println(afterTransformations);
        int lengthAfterTransformationsOptimal = lengthAfterTransformationsUsingMap(s, t);
        System.out.println(lengthAfterTransformationsOptimal);
        int lengthed = lengthAfterTransformationsOptimal(s, t);
        System.out.println(lengthed);

    }

    private static int lengthAfterTransformationsOptimal(String s, int t) {
        int M = 1_000_000_007;
        int[] mp = new int[26];
        for (char ch : s.toCharArray()) {
            mp[ch - 'a']++;
        }
        for (int count = 1; count <= t; count++) {
            int[] temp = new int[26];
            for (int i = 0; i < 26; i++) {
                char ch = (char) (i + 'a');
                int freq = mp[i];
                if (ch != 'z') {
                    temp[(ch + 1) - 'a'] = (temp[(ch + 1) - 'a'] + freq) % M;
                } else {
                    temp[0] = (temp[0] + freq) % M;
                    temp['b' - 'a'] = (temp['b' - 'a'] + freq) % M;
                }
            }
            mp = temp;
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            result = (result + mp[i]) % M;
        }
        return result;
    }

}
