package com.practice.interviewquestion.streamapiinterviewquestion;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: Sandeep Singh
 * Date: 11/03/25
 */

public class JoinListPrefixSuffixDelimeter {
    public static void main(String[] args) {
        List<String> stringList = List.of("aa", "bb", "cc", "dd", "ee", "ff");
        String joinString = stringList.stream()
                .collect(Collectors.joining(" delimiter", " prefix", " suffix"));
        System.out.println(joinString);


        String collect = stringList.stream()
                .collect(Collectors.joining());
        System.out.println(collect);
    }
}
