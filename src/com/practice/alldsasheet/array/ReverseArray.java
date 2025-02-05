package com.practice.alldsasheet.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: Sandeep Singh
 * Date: 31/01/25
 */

public class ReverseArray {
    public static void main(String[] args) {
        int[] input = {3, 2, 5, 24, 2, 54, 4, 35};
//        int[] result = reverseArray(input);
        int[] usingCollectionReverse = usingCollectionReverse(input);
//        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(usingCollectionReverse));
    }

    private static int[] usingCollectionReverse(int[] input) {

        List<Integer> list = Arrays.stream(input)
                .boxed() // Convert each int to Integer
                .collect(Collectors.toList());
        Collections.reverse(list);

        /*for (int i = 0; i < list.size(); i++) {
            input[i] = list.get(i);
        }*/

        input = list.stream().mapToInt(v -> v).toArray();
        return input;
    }

    private static int[] reverseArray(int[] input) {
        int l = 0;
        int r = input.length - 1;
        int size = input.length / 2;
        while (size > 0) {
            int temp = input[l];
            input[l++] = input[r];
            input[r--] = temp;
            size--;
        }
        return input;
    }
}
