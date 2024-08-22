package com.practice.map;

import java.util.*;
import java.util.stream.Collectors;

public class SortTheKeyValue {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(3,7);
        map.put(9,7);
        map.put(2,8);
        map.put(6,3);
        map.put(4,1);
        System.out.println(map);
// Default is sort by Key
        LinkedHashMap<Integer, Integer> collect = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println(collect);
    }
}
