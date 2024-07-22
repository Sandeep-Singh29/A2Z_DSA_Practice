package com.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseTheGivenNumberArray {
    public static List<Integer> dataReverse(ArrayList<Integer> integers, int m) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i <= m; i++) {
//            list.add(integers.get(i));
//        }
//
//        for (int i = integers.size()-1; i > m; i--) {
//            list.add(integers.get(i));
//        }
//        return list;
        int start = m + 1;
        int end = integers.size() - 1;

        while (start < end) {
            Collections.swap(integers, end, start);
            start++;
            end--;
        }
        return integers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        int m = 2;
        List<Integer> integers1 = dataReverse(integers, m);
        System.out.println(integers1);
    }


}
