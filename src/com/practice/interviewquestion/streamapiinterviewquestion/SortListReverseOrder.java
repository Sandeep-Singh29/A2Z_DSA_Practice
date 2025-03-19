package com.practice.interviewquestion.streamapiinterviewquestion;

import java.util.Comparator;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 11/03/25
 */

public class SortListReverseOrder {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 6, 7, 1, 2, 8, 9, 3, 4);

        List<Integer> sortList = integers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortList);


    }
}
