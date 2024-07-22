package com.practice.other;

import java.util.*;

public class CountWiseChar {
    public static void main(String[] args) {
        String name = "appleeee"; // alepp
        String convert = countBySorting(name);
        System.out.println(convert);
    }

    private static String countBySorting(String name) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : name.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(frequencyMap);

        TreeMap<Integer, List<Character>> groupedByFrequency = new TreeMap<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char character = entry.getKey();
            int frequency = entry.getValue();
            if (!groupedByFrequency.containsKey(frequency)) {
                groupedByFrequency.put(frequency, new ArrayList<>());
            }
            groupedByFrequency.get(frequency).add(character);
        }
        System.out.println(groupedByFrequency);


        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, List<Character>> entry : groupedByFrequency.entrySet()) {
            int count = entry.getKey();
            List<Character> characters = entry.getValue();
            for (char c : characters) {
                for (int i = 0; i < count; i++) {
                    result.append(c);
                }
            }
        }
        return result.toString();

    }
}
