package com.practice.basicrecursion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMinMax {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 4, 5, 6, 7, 7, 8);
        Map<String, Integer> map = findMinMax(integers);
        System.out.println(map);
    }

    private static Map<String, Integer> findMinMax(List<Integer> integers) {
        int min = integers.get(0);
        int max = integers.get(0);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i < integers.size(); i++) {
            if (min > integers.get(i)) {
                min = integers.get(i);
            } else {
                max = integers.get(i);
            }
        }
        map.put("min", min);
        map.put("max", max);
        int minx = integers.get(0);
        int maxx = integers.get(0);
        for (int i = 0; i < integers.size(); i++) {
            minx = Math.min(minx, integers.get(i));
            maxx = Math.max(maxx, integers.get(i));
        }
        System.out.println("min : " + minx + "  max  : " + maxx);
        return map;
    }
}

