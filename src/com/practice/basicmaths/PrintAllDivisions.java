package com.practice.basicmaths;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisions {

    public static void main(String[] args) {
        int num = 36;
        List<Integer> list = printDivision(num);
        System.out.println(list);
    }

    private static List<Integer> printDivision(int num) {
        List<Integer> list = new ArrayList<>();
        int i = 1;
        while (Math.sqrt(num) > i) {
            if (num % i == 0) {
                list.add(i);
                if ((num / i) != i) {
                    list.add(num / i);
                }
            }
            i++;
        }

        return list.stream().sorted().toList();
    }
}
