package com.practice.interviewquestion.streamapi.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 07/02/25
 */

public class SortTheList {
    public static void main(String[] args) {
        List<Integer> integers = List.of(2, 6, 9, 4, 2, 3, 6, 89, 2);
        List<Integer> list = integers.stream().sorted().toList();
        System.out.println("Asc Order Sort : " + list); //
        List<Integer> list1 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Desc Order Sort : " + list1);

    }
}
