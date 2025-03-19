package com.practice.interviewquestion.streamapiinterviewquestion;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 11/03/25
 */

public class GetLastElement {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        String lastElement = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();
        System.out.println(lastElement);

        String secondLast = listOfStrings.stream().skip(listOfStrings.size() - 2).findFirst().get();
        System.out.println(secondLast);


    }
}
