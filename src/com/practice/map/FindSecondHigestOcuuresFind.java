package com.practice.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FindSecondHigestOcuuresFind {
    public static void main(String[] args) {
        String name = "sandeeppppwww";
        Map<Character, Integer> m = countSecondHigh(name);
        System.out.println(m);
    }

    private static Map<Character, Integer> countSecondHigh(String name) {
        Map<Character, Integer> map = new TreeMap<>();
        for (char c : name.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        LinkedHashMap<Character, Integer> collect1 = map.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (old, existing) -> old,
                        LinkedHashMap::new
                ));
//        System.out.println(collect1);
        Map.Entry<Character, Integer> charD = collect1.entrySet().stream().skip(1).findFirst().get();
        System.out.println("Key is : " + charD.getKey() + " Value is : " + charD.getValue());
        map = new HashMap<>();
        map.put(charD.getKey(), charD.getValue());
        return map;
    }
}
