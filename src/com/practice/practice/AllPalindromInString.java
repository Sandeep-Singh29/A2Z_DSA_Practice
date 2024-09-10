package com.practice.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllPalindromInString {
    public static void main(String[] args) {
        String str = "madamaa";
        List<String> list = findAllPalindrom(str);
        System.out.println(list);
        String str1 = longestPalindrom(list);
        System.out.println(str1);
    }

    private static String longestPalindrom(List<String> list) {
        int max = 0;
        String str ="";
        for(int i=0;i<list.size();i++){
            if(max<list.get(i).length()){
                str = list.get(i);
                max = Math.max(max,list.get(i).length());
            }
        }
        return str;
    }

    private static List<String> findAllPalindrom(String str) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String subtr = str.substring(i,j+1);
                boolean check = checkPali(subtr);
                if(check){
                    set.add(subtr);
                }
            }
        }
        List<String> list = new ArrayList<>(set);
        return list;
    }

    private static boolean checkPali(String subtr) {
        int i = 0;
        int j = subtr.length() - 1;
        while (i < j) {
            if (subtr.charAt(i) != subtr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
