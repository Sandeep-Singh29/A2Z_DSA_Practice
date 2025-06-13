package com.practice.interviewquestion.streamapi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author: Sandeep Singh
 * Date: 10/06/25
 */

public class MapSortingUsingPQAndLinkedMap {

    public static void main(String[] args) {
        Map<String, Integer> fruits = Map.of("apple", 4, "banana", 9, "orange", 2, "grapes", 20, "guava", 1);
        System.out.println(fruits);
        LinkedHashMap sortedByValue = sortingUsingLinkedHashMapASC(fruits);
        System.out.println("sortingUsingLinkedHashMapASC ::  " + sortedByValue);
        LinkedHashMap sortingUsingLinkedHashMapDESC = sortingUsingLinkedHashMapDESC(fruits);
        System.out.println("sortingUsingLinkedHashMapDESC ::  " + sortingUsingLinkedHashMapDESC);


    }

    private static LinkedHashMap sortingUsingLinkedHashMapDESC(Map<String, Integer> fruits) {
        return fruits.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
                Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (newEntry, oldEntry) -> oldEntry,
                        LinkedHashMap::new
                ));
    }


    private static LinkedHashMap sortingUsingLinkedHashMapASC(Map<String, Integer> fruits) {
        return fruits.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).collect(
                Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (existEntry, newEntry) -> newEntry,
                        LinkedHashMap::new
                ));
    }




}
