package com.practice.interviewquestion.streamapi.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author: Sandeep Singh
 * Date: 07/02/25
 */

public class SortMapByKeyAndValue {
    public static void main(String[] args) {

        Map<String, Integer> phones = Map.of("iphone15", 70, "samsung",
                100, "moto", 20, "oneplus", 30, "nothing", 40, "googlepixel", 50);
        System.out.println("Iterate Map");
        phones.entrySet().forEach(System.out::println);

        // All Phones In Ascending Order by Key
        LinkedHashMap<String, Integer> sortByKey = phones.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println(sortByKey);

        // All Phones In Ascending Order By Value
        LinkedHashMap<String, Integer> sortByValue = phones.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortByValue);
    }
}
