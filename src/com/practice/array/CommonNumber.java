package com.practice.array;

import java.util.*;
import java.util.stream.Collectors;

public class CommonNumber {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 5, 10, 20, 40, 80, 20);
        List<Integer> arr2 = Arrays.asList(6, 7, 20, 80, 100, 20);
        List<Integer> arr3 = Arrays.asList(3, 4, 15, 20, 30, 70, 80, 120, 20);
        List<Integer> common = commonNum(arr1, arr2, arr3);
        System.out.println(common);
    }

    private static List<Integer> commonNum(List<Integer> arr1, List<Integer> arr2, List<Integer> arr3) {
        List<Integer> list = new ArrayList<>();
        int j = 0;
        int size = arr1.size();
        while (size > 0) {
            if (arr2.contains(arr1.get(j)) && arr3.contains(arr1.get(j))) {
                if (!list.contains(arr1.get(j))) {
                    list.add(arr1.get(j));
                }
            }
            j++;
            size--;
        }
        return list;
    }
}
