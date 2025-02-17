package com.practice.interviewquestion.streamapi.flatmap;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 07/02/25
 */

public class FlatMapExample {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(1, 2, 3, 4);
        List<Integer> l2 = List.of(5, 6, 7, 8);
        List<Integer> l3 = List.of(9, 10, 11, 12);
        List<List<Integer>> list = List.of(l1,l2,l3);
        System.out.println(list);
        List<Integer> finalList = list.stream().flatMap(s -> s.stream()).toList();
        System.out.println(finalList);
        // List of list all element square root
        List<Integer> sqRootOfList = list.stream().flatMap(s -> s.stream().map(e -> e * e)).toList();
        System.out.println(sqRootOfList);
    }
}
