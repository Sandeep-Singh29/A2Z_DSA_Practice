package com.practice.array;

import java.util.Arrays;

/**
 * Author: SANDEEP
 * Date: 13/12/24
 */

public class ArrayEqualMethod {



    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {4, 2, 3, 5, 1};
        Arrays.sort(a);
        Arrays.sort(b);
        boolean equals = Arrays.equals(a, b);
        System.out.println(equals);

    }
}
