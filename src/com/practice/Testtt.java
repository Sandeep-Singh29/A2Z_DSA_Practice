package com.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Author: Sandeep Singh
 * Date: 06/02/25
 */

public class Testtt {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 3, 57, 5, 3, 2, 54, 7);
       /* String str = new String();
        String intern = str.intern();
        System.out.println("intern value is : " + intern);
        str = "Hello";
        System.out.println("intern value is : " + str.intern());*/

        List<List<String>> skills = Arrays.asList(
                Arrays.asList("A","B","C"),
                Arrays.asList("D","E","F"),
                Arrays.asList("G","A","I"),
                Arrays.asList("J","K","L")
        );
        List<String> list1 = skills.stream().flatMap(skill -> skill.stream()).toList();
        System.out.println(list1);
        List<String> a = list1.stream().filter(s -> s.startsWith("A")).toList();
        System.out.println(a);

    }
}
