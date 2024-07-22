package com.practice.other;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String name = "sandeep";
        char[] charArray = name.toCharArray();
        Arrays.sort(charArray);
        String string = new String(charArray);
        System.out.println(string);
    }
}
