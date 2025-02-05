package com.practice.interviewquestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurInString {
    public static void main(String[] args) {
        String string = "sandeep";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : string.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        Map<String, Long> collect = Arrays.stream(string.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }

}
