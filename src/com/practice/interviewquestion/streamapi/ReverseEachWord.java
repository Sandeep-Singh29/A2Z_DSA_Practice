package com.practice.interviewquestion.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Author: Sandeep Singh
 * Date: 13/03/25
 */

public class ReverseEachWord {
    public static void main(String[] args) {
        String data = "sandeep";

        String reverse = Arrays.stream(data.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining());
        System.out.println(reverse);
    }
}
