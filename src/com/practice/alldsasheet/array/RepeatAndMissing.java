package com.practice.alldsasheet.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 03/02/25
 */

public class RepeatAndMissing {

    public static void main(String[] args) {
        ArrayList<Integer> integers = repeatedNumber(List.of(3, 1, 2, 5, 3));
        System.out.println(integers);
    }

    public static ArrayList<Integer> repeatedNumber(List<Integer> arr) {
        ArrayList<Integer> list = new ArrayList<>();  // 1 2 3 3 5
        arr = arr.stream().sorted().toList();
        int miss = findMissing(arr);
        int repeat = findRepeat(arr);
        System.out.println("Miss: " + miss);
        System.out.println("Repeat: " + repeat);
        list.add(repeat);
        list.add(miss);
        return list;
    }


    private static int findRepeat(List<Integer> arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (!list.contains(arr.get(i))) {
                list.add(arr.get(i));
            } else {
                return arr.get(i);
            }
        }
        return 0;
    }

    private static int findMissing(List<Integer> arr) {
        List<Integer> dList = arr.stream().distinct().toList();
        int miss = dList.get(0);
        for (int i = 1; i < dList.size(); i++) {
            miss++;
            if (miss != dList.get(i)) {
                return miss;
            }
        }
        return 0;
    }
}
