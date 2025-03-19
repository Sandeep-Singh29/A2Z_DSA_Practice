package com.practice.interviewquestion.streamapiinterviewquestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 11/03/25
 */



/*

(a, b) -> a - b is a lambda function that compares two integers.
It works similarly to Integer::compareTo, where:
If a - b is negative, a is smaller.
If a - b is positive, a is larger.
If a - b is zero, they are equal.

*/


public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // way 1
        Integer max = integers.stream().max(Comparator.naturalOrder()).get();
        Integer min = integers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(max);
        System.out.println(min);

        // way 1
        Integer maxx = integers.stream().max(Integer::compareTo).get(); // using method reference
        Integer minn = integers.stream().min((a, b) -> a - b).get(); // using lambda expression
        System.out.println(maxx);
        System.out.println(minn);


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int maxi = Arrays.stream(arr).max().getAsInt();
        int mini = Arrays.stream(arr).min().getAsInt();

        System.out.println(maxi);
        System.out.println(mini);

    }
}
