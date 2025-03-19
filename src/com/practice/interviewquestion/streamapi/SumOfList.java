package com.practice.interviewquestion.streamapi;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: Sandeep Singh
 * Date: 20/02/25
 */

public class SumOfList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(9,1, 2, 3, 4, 5, 6, 7, 0);
        // Using Sum method
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        // Using Collectors
        int collect = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(collect);

        // USing Reduce
        Integer reduce = numbers.stream().reduce(0, Integer::max);
        System.out.println(reduce);

    }
}
