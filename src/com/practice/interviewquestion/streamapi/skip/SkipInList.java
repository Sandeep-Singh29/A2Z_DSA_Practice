package com.practice.interviewquestion.streamapi.skip;

import java.util.Comparator;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 07/02/25
 */

public class SkipInList {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 4, 45, 6, 78, 8);
        Integer i = integers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i);
    }
}
