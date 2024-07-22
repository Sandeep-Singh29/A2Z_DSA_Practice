package com.practice.other;

public class ReverseString {


    public static void main(String[] args) {
        String name = "sandeep";
        String data = "my name is sandeep";
        String n = reverseName(name);
        System.out.println(n);
        String d = reverseData(data);
        System.out.println(d);
        String c  = firstCharCapital(data);

    }

    private static String firstCharCapital(String data) {
        return null;
    }

    private static String reverseData(String data) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] s = data.split(" ");
        for(int i = s.length-1; i>=0 ; i--){
            stringBuilder.append(s[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    private static String reverseName(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            stringBuilder.append(name.charAt(i));
        }
        return stringBuilder.toString();
    }
}
