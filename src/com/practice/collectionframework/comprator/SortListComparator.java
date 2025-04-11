package com.practice.collectionframework.comprator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 08/04/25
 */

public class SortListComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
//      Collections.sort(list);
//      list.sort((a, b) -> b-a);                        // [4, 3, 3, 3, 2, 1, 1, 1]
//      list.sort((a, b) -> a - b);     // [1, 1, 1, 2, 3, 3, 3, 4]

        list.sort(Comparator.naturalOrder()); // ascending
        System.out.println(list);
        list.sort(Comparator.reverseOrder()); // descending
        System.out.println(list);
    }



    /*
    // Frequency Logic
    Map<Integer,Integer> freq = new HashMap<>();
    Set<Integer> set = new HashSet<>(list);
        for(Integer v : set){
        int frequency = Collections.frequency(list, Integer.valueOf(v));
        freq.put(v,frequency);
    }*/

}
