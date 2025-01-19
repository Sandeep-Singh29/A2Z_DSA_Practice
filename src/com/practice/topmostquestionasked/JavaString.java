package com.practice.topmostquestionasked;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Author: SANDEEP
 * Date: 07/01/25
 */

public class JavaString {

    public static void main(String[] args) {
        String a = "sandeepsingh";
        String collect = Arrays.stream(a.split("")).map(c -> String.valueOf(c).toUpperCase()).collect(Collectors.joining());
        System.out.println(collect);
        String collect1 = a.chars().mapToObj(c -> (char) c)
                .map(c -> String.valueOf(c).toUpperCase())
                .collect(Collectors.joining());
        System.out.println(collect1);
    }
}
