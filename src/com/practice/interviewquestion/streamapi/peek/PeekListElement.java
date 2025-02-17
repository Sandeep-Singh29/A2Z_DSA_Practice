package com.practice.interviewquestion.streamapi.peek;

import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 07/02/25
 */

public class PeekListElement {
    public static void main(String[] args) {
        List<Integer> integers = List.of(12, 3, 4, 5, 56, 7);
        List<Integer> list = integers.stream().filter(e -> e >= 5)
                .peek(System.out::println)
                        .map(e->e+1).toList();
        System.out.println(list);
    }
}
