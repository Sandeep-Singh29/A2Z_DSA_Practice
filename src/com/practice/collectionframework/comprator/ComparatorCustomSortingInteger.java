package com.practice.collectionframework.comprator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 08/04/25
 */

class MyIntegerComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;   // descending order
        // return o1-o2; // ascending order
    }


}

public class ComparatorCustomSortingInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.sort(new MyIntegerComparator()); // custom sorting using Comparator
        System.out.println(list);

        List<Integer> list1 = Arrays.asList(3, 5, 7, 4, 3, 2);

        list1.sort((a,b)-> a-b); // sorting using lambda
        System.out.println(list1);


    }
}
