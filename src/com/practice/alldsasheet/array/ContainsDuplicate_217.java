package com.practice.alldsasheet.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Author: Sandeep Singh
 * Date: 31/01/25
 */

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
//        boolean max = containsDupliacte(arr);
        boolean usingHashSet = usingHasSet(arr);
//        System.out.println(max);
        System.out.println(usingHashSet);

    }

    private static boolean usingHasSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int v : arr) {
            if (set.contains(v)) {
                return true;
            }
            set.add(v);
        }
        return false;
    }

    private static boolean containsDupliacte(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int v : arr) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        for (int v : arr) {
            if (map.get(v) == 2) {
                return false;
            }
        }
        return true;
    }
}
