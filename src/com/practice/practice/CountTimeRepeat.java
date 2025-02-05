package com.practice.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountTimeRepeat {

    public static void main(String[] args) {
        String str = "w4a3d1x6a";
        String data = repeatCount(str);
        System.out.println(data);
    }


    private static String repeatCount(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (i != str.length() - 1 && i % 2 == 0) {
                String s = String.valueOf(str.charAt(i + 1));
                int val = Integer.parseInt(s);
                map.put(str.charAt(i), val);
            }
        }
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            stringBuilder.append(String.valueOf(m.getKey()).repeat(m.getValue()));
        }
        stringBuilder.append(str.charAt(str.length() - 1));
        return stringBuilder.toString();
    }

}
