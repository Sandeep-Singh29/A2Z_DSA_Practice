package com.practice.interviewquestion.streamapiinterviewquestion;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Author: Sandeep Singh
 * Date: 11/03/25
 */

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String data = "sandeepsingh";

        // way 1
        Map<String, Long> frequencyMap = Arrays.stream(data.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);

        // way-2
        Map<Character, Long> frequencyMapWay2 = data.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMapWay2);

    }
}
