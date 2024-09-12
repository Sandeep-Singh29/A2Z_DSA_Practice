package com.practice.practice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "sandeep";
        String str2 = "deepsan";
        char[] charArray = str1.toCharArray();
        char[] charArray1 = str2.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        String s1 = String.valueOf(charArray);
        String s2 = String.valueOf(charArray1);
        if(s1.equals(s2)){
            System.out.println("String are Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
