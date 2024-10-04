package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.*;

/**
 * Author: SANDEEP
 * Date: 04/10/24
 */

public class MapWork {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // isEmpty()
        System.out.println("Map isEmpty : " + map.isEmpty());
        // put()
        map.put("aman", 80);
        map.put("sandeep", 90);
        map.put("kuldeep", 90);
        map.put("rishbah", 99);
        map.put("vivek", 85);
        map.put("vikas", 85);
        System.out.println(map);
        // map.get()
        System.out.println("Get Sandeep Marks : " + map.get("sandeep"));
        // map.containsKey()
        System.out.println("kuldeep key is present : " + map.containsKey("kuldeep"));
        // map.containsValue()
        System.out.println("90 value is present : " + map.containsValue(90));
        // map.size()
        System.out.println("Map Size : " + map.size());
        // map.isEmpty()
        System.out.println("Map isEmpty : " + map.isEmpty());
        // map.remove()
        System.out.println("Remove Vikas Key : " + map.remove("vikas"));
        System.out.println(map);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("test", 100);
        // map.putAll()
        map2.putAll(map);
        System.out.println("Map2 Put All Data of Map : " + map2);
        // map.clear()
        map2.clear();
        System.out.println("After Remove All data for Map-2 : " + map2);
        System.out.println("After Remove All data for Map-2 Check Data present in Map-1 : " + map);


        // Key Set >> get Set of Keys
        Set<String> mapKeys = map.keySet();
        System.out.println("Map keySet() : " + mapKeys);

        // values get Collection of Keys
        Collection<Integer> values = map.values();
        System.out.println("Collection of Values : " + values);

        // Key Set get the Set of Map Entry // Using when you iterate a Map
        Set<Map.Entry<String, Integer>> mapEntry = map.entrySet();
        System.out.println("All Map EntrySet : " + mapEntry);

        // map.equals()
        boolean equals = map.equals(map2);
        System.out.println("Map is Equal : " + equals);

        // map.hashCode()
        int hashed = map.hashCode();
        System.out.println("HasCode Value is : " + hashed);
        // map.hashCode()
        int keyHashCode = Objects.hashCode("sandeep");
        System.out.println("Get the Key HashCode : " + keyHashCode);

    }


}
