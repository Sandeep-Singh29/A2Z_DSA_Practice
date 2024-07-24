package com.practice.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class NonMatchingChar {
    public static void main(String[] args) {
        String data = "saannddeep";
        Map<Character,Integer> map = new HashMap<>();
        for(char c : data.toCharArray()){
            map.put(c ,map.getOrDefault(c , 0)+1);
        }
        LinkedHashMap<Character, Integer> collect = map.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue()).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new
        ));
        Map.Entry<Character, Integer> characterIntegerEntry = collect.entrySet().stream().findFirst().get();
        Character key = characterIntegerEntry.getKey();
        System.out.println(key);

    }
}
