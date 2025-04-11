package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Author: Sandeep Singh
 * Date: 06/02/25
 */

public class Testtt {
    public static void main(String[] args) {
        String s = "there is a free tree has leaves leaves are there green";// tree=2 leaves=2
        Map<String, Long> collect = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Map.Entry<String, Long>> list = collect.entrySet().stream().filter(e -> e.getValue() == 2).toList();
        System.out.println(list);

    }
}
