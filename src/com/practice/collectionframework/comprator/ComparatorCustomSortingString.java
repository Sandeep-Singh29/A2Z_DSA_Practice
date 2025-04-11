package com.practice.collectionframework.comprator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 08/04/25
 */

class MyStringComparator implements Comparator<String> {

    @Override // also
    public int compare(String o1, String o2) {
        //return o1.compareTo(o2); // ascending order
        return o2.compareTo(o1); // descending order
    }
}

public class ComparatorCustomSortingString {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a", "f", "c", "e", "b");
        stringList.sort(new MyStringComparator());
        System.out.println(stringList);

        List<String> list = Arrays.asList("aman", "sandeep", "kuldeep", "vivek", "ramesh");
//        list.sort((a,b)-> a.compareTo(b));
//        list.sort((a,b)-> a.length()-b.length());
//        list.sort(Comparator.comparingInt(String::length));
//        list.sort(String::compareTo);
//        list.sort(Comparator.reverseOrder());
        list.sort(Comparator.naturalOrder());
// All are gives me a same result
        System.out.println(list);

    }
}
