package com.practice.map;

import java.util.HashMap;
import java.util.Map;

public class CountVowel {
    public static void main(String[] args) {
        String data = "aeiouaeiouaeiouppppp";
        int count = countVowel(data);
        System.out.println(count);
    }

    private static int countVowel(String data) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : data.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        int count = 0;
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getKey() == 'a' || m.getKey() == 'e' || m.getKey() == 'i' || m.getKey() == 'o' || m.getKey() == 'u') {
                count += m.getValue();
            }
        }
        return count;
    }
}
