package com.practice.other;

import java.util.Comparator;
import java.util.List;

public class GivenHighest {
    public static void main(String[] args) {
        int high = 0;
        List<Integer> integers = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6);
        int num = findGivenHigest(integers, high);
        System.out.println(num);
    }

    private static int findGivenHigest(List<Integer> integers, int high) {
        Integer i = integers.stream().distinct().sorted(Comparator.reverseOrder()).skip(high).findFirst().get();
        return (int) i;
    }

}
