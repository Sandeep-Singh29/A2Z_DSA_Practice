package com.practice.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxContinueLetterReturnLength {
    public static void main(String[] args) {
        String d = "abcbbcccccdddcppde";
        int len = findMaxLength(d);
        System.out.println(len);
    }

    private static int findMaxLength(String d) {
        Map<String, Long> collect = Arrays.stream(d.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
//        PriorityQueue<Map.Entry<String , Long>> pq = new PriorityQueue<>((a, b) -> Math.toIntExact(b.getValue() - a.getValue()));
//        pq.addAll(collect.entrySet());
//        System.out.println(pq);
//        Map.Entry<String, Long> stringLongEntry = pq.stream().findFirst().get();
//        System.out.println(stringLongEntry);

//        LinkedHashMap<String, Long> sortedMapDesc = collect.entrySet()
//                .stream()
//                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (e1, e2) -> e1,
//                        LinkedHashMap::new
//                ));
//        System.out.println(sortedMapDesc);
        Map<Character, Integer> map = new HashMap<>();
        for (char c : d.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());
        System.out.println(pq);
        return 0;
    }
}
