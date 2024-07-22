package com.practice.other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharcterOccurs {

    private static Map<Character, Integer> usingMap(String d) {
        Map<Character, Integer> m = new HashMap<>();
        for (char c : d.toCharArray()) {
            if (!m.containsKey(c)) {
                m.put(c, 1);
            } else {
                m.put(c, m.get(c) + 1);
            }
        }
        return m;
    }

    private static Map<String, Long> usingStream(String d) {
        return Arrays.stream(d.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void main(String[] args) {
        String d = "sandeep";
        Map<Character, Integer> m = usingMap(d);
        System.out.println("Using Map : " + m);
        Map<String, Long> s = usingStream(d);
        System.out.println("Using Stream : " + s);
    }

}
