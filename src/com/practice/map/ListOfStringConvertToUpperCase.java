package com.practice.map;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringConvertToUpperCase {
    public static void main(String[] args) {
        List<String> str = List.of("abc","def","ghi","jkl");
        String collect = str.stream().map(String::toUpperCase).collect(Collectors.joining());
        System.out.println(collect);
        List<String> collect1 = str.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
