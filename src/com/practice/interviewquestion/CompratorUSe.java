package com.practice.interviewquestion;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Author: Sandeep Singh
 * Date: 07/02/25
 */

public class CompratorUSe {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 6, 7, 4, 5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (a, b) -> b - a);
        System.out.println(Arrays.toString(arr));

        Integer[] arr2 = {2, 4, 6, 6, 3, 23, 5, 5};
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; //o2 - o1=desc // o1 - o2 =asc
            }
        });
        System.out.println(Arrays.toString(arr2));

        String[] name = {"sandeep", "aman", "usman", "vivek", "omvir", "rohit"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
        Arrays.sort(name, (a, b) -> b.compareTo(a));
        //Arrays.sort(name , Comparator.reverseOrder());
        System.out.println(Arrays.toString(name));


        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(4, 55);
        map.put(2, 30);
        map.put(3, 70);
        System.out.println(map);
        Map<Integer, Integer> treeMap = new TreeMap<>((a, b) -> b - a);
        treeMap.putAll(map);
        System.out.println(treeMap);

        LinkedHashMap<Integer, Integer> collect = treeMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue,
                (k, v) -> k,
                LinkedHashMap::new
        ));
        System.out.println(collect);


    }
}
