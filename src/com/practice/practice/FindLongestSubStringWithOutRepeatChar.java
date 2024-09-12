package com.practice.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindLongestSubStringWithOutRepeatChar {
    public static void main(String[] args) {
        String str = "cabdzabcd";
//        String largestStr = findLargestStr(str);
//        System.out.println(largestStr);
//        System.out.println(largestStr.length());
        int largest = findLargestStrOptimal(str);
        System.out.println(largest);
        int map = findLargestStrOptimalUsingMap(str);
        System.out.println(largest);
    }

    private static int findLargestStrOptimalUsingMap(String str) {
        int max =0;
        int start =0;
        Map<Character,Integer> map = new HashMap<>();
        for(int end =0;end<str.length();end++){
            char c = str.charAt(end);
            if(map.containsKey(c)){
                if(start<=map.get(c)){
                    start = map.get(c)+1;
                }
            }
            map.put(c,end);
            max = Math.max(max,end-start+1);
        }
        return max ;
    }

    private static int findLargestStrOptimal(String str) {
        int i =0;
        int r =0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while(r<str.length()){
            if(set.contains(str.charAt(r))){
                while (i<r && set.contains(str.charAt(r))){
                        set.remove(str.charAt(i));
                        i++;
                }
            }
            set.add(str.charAt(r));
            max = Math.max(max,r-i+1);
            r++;
        }
        return max;
    }

    private static String findLargestStr(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            String subStr = String.valueOf(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                subStr += String.valueOf(str.charAt(j));
                //System.out.print(subStr + " ,");
                boolean bol = checkedWithOutRepeatChar(subStr);
                if (bol) {
                    if (ans.length() < subStr.length()) {
                        ans = subStr;
                    }
                }else{
                    break;
                }
            }
        }
        return ans;
    }

    private static boolean checkedWithOutRepeatChar(String subStr) {
        for (int i = 0; i < subStr.length(); i++) {
            if (subStr.indexOf(String.valueOf(subStr.charAt(i))) != subStr.lastIndexOf(String.valueOf(subStr.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
