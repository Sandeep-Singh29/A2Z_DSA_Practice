package com.practice.other;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

    private static Character nonRepeat(String d) {
        for (int i = 0; i < d.length(); i++) {
            int count = checkRepeat(d, d.charAt(i));
            if (count == 1) {
                return d.charAt(i);
            }
        }
        return null;
    }

    private static int checkRepeat(String d, char c) {
        int count = 0;
        for (int j = 0; j < d.length(); j++) {
            if (d.charAt(j) == c) {
                count++;
            }
        }
        return count;
    }

    private static Character usingStringSort(String d) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : d.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
//        for (Map.Entry<Character, Integer> m : map.entrySet()) {
//            if (m.getValue() == 1) {
//                return m.getKey();
//            }
//        }
//        Map<Character, Integer> collect = map.entrySet().stream().filter(m -> m.getValue() == 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        System.out.println(collect);
        Character c = map.entrySet().stream().filter(m -> m.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
        return c;
    }


    public static void main(String[] args) {
        String d = "abcbda";
//        Character c = nonRepeat(d);
//        System.out.println(c);
//        Character cc = usingStringSort(d);
//        System.out.println(cc);
        Character ccc = usingJavaStream(d);
        System.out.println("Using Stream :  " + ccc);
    }

    private static Character usingJavaStream(String d) {
        Map<Character, Long> charCountMap = d.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return charCountMap.entrySet().stream().filter(m -> m.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
    }
}
