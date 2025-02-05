package com.practice.interviewquestion.streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 31/01/25
 */

public class ArrayOfStringIntoUpperCase {
    public static void main(String[] args) {
        String[] car = {"Audi", "Swift", "Alto", "Thar", "Bmw"};
        String[] result = toUpperCaseCar(car);
        System.out.println(Arrays.toString(result));
    }

    private static String[] toUpperCaseCar(String[] car) {
        String[] array = Arrays.stream(car)
                .map(String::toUpperCase)
                .toArray(String[]::new);
        List<String> collect = Arrays.stream(car).map(String::toUpperCase).toList();
        System.out.println("List " + collect);
        return array;
    }
}
