package com.practice.interviewquestion.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author: Sandeep Singh
 * Date: 07/06/25
 */

public class ListConvertToMapAndGetEvenAndOdd {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(v -> v%2==0));
        System.out.println(collect);

    }
}

