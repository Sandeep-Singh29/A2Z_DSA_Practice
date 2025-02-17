package com.practice.interviewquestion.streamapi.flatmap;

import java.util.Collection;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 07/02/25
 */

public class UpperCaseAllList {
    public static void main(String[] args) {
        List<List<String>> list = List.of(List.of("a","b"),List.of("c","d"),List.of("e","f"));

        List<String> parallelStream = list.stream().flatMap(Collection::parallelStream).toList();
        System.out.println(parallelStream);
        List<String> flatStream = list.stream().flatMap(Collection::stream).toList();
        System.out.println(flatStream);
        // toUpperCase
        List<String> toUpperCase = list.stream().flatMap(Collection::stream).map(String::toUpperCase).toList();
        System.out.println(toUpperCase);
    }
}
