package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Author: SANDEEP
 * Date: 04-10-2024
 */

public class IterateMapKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("sandeep", 90);
        map.put("kuldeep", 95);
        map.put("rishabh", 99);
        map.put("aman", 91);
        map.put("vivek", 98);
        System.out.println("Map Data : " + map);
        // Iterate Key
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("----Iterate Key And Value----");
        // Iterate Key and Value
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        // Iterate Key and Value Using entrySet()
        System.out.println("------Iterate Key and Value Using entrySet()-------- ");
        for (Object m : map.entrySet()) {
            System.out.println(m);
        }
        // Iterate Key and Value Using entrySet()"
        System.out.println("-------Iterate Key and Value Using entrySet()--------");
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println("Key is : " + m.getKey() + " value is : " + m.getValue());
        }
    }

}