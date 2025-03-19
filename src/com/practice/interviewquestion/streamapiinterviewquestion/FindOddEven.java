package com.practice.interviewquestion.streamapiinterviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author: Sandeep Singh
 * Date: 11/03/25
 */

public class FindOddEven {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};

        List<Integer> even = Arrays.stream(arr).filter(e -> e % 2 == 0).boxed().toList();
        List<Integer> odd = Arrays.stream(arr).filter(e -> e % 2 != 0).boxed().toList();
        System.out.println(even);
        System.out.println(odd);


        Map<Boolean, List<Integer>> collect = Arrays
                .stream(arr).boxed()
                .collect(Collectors.partitioningBy(e -> e % 2 == 0));
        System.out.println(collect);


    }
}
