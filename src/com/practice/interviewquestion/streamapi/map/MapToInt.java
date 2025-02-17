package com.practice.interviewquestion.streamapi.map;

import java.util.Arrays;

/**
 * Author: Sandeep Singh
 * Date: 07/02/25
 */

public class MapToInt {
    public static void main(String[] args) {

        String[] arr = {"1", "2", "3", "4", "5"};
        int[] array = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(array));




    }
}
