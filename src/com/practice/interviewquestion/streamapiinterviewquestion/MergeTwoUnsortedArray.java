package com.practice.interviewquestion.streamapiinterviewquestion;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Author: Sandeep Singh
 * Date: 11/03/25
 */

public class MergeTwoUnsortedArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 8, 5, 3, 2};
        int[] b = {10, 31, 16, 28};

        int[] sortedArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(sortedArray));
    }
}
