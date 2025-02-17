package com.practice.interviewquestion.streamapi.distrinct;

import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 07/02/25
 */

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 2, 1, 123, 4, 52);
        List<Integer> list = integers.stream().distinct().toList();
        System.out.println(list);
    }
}
