package com.practice.map;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharcterIndex {
    public static void main(String[] args) {
        String str = "sandeep";
//        int idx = findIndexString(str);
//        System.out.println(idx);
        int idx2 = findIndexStringway2(str);
//        System.out.println(idx2);

        Map<String, Long> frequency = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        String string = Arrays.stream(str.split(""))
                .filter(ch -> frequency.get(ch) == 1)
                .findFirst()
                .orElse("No Unique Character");
        System.out.println(string);
    }

    private static int findIndexStringway2(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    private static int findIndexString(String str) {
        for (int i = 0; i < str.length(); i++) {
            int count = checkIndexCount(str, str.charAt(i));
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

    private static int checkIndexCount(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
