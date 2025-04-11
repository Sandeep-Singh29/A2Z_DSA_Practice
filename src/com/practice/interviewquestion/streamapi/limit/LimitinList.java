package com.practice.interviewquestion.streamapi.limit;

import java.util.Comparator;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 07/02/25
 */

public class LimitinList {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 5, 6, 7);
        List<Integer> list = integers.stream().limit(2).toList();
        System.out.println(list);

        // Using limit we have find the 2 largest elemnt
        List<Integer> list1 = integers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).toList();
        System.out.println(list1);
        // Other way
        Integer i = integers.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println(i);
    }
}
