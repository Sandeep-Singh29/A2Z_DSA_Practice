package com.practice.collectionframework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 07/04/25
 */

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(8);
        System.out.println("Element at index 2 :: " + arrayList.get(2));
        System.out.println("Size of List :: " + arrayList.size());
        System.out.println("3 is Contains :: " + arrayList.contains(3));
        System.out.println("Remove element if present :: " + arrayList.removeIf(e -> e == 4));
        System.out.println("\n\nAll List :: " + arrayList);
        arrayList.add(1, 10);
        System.out.println("Insert 10 at position 1");
        arrayList.set(2, 100); // set() is use for replace element in an position so 5 remove at P-2 and 100 set
        System.out.println("\n\nAll List :: " + arrayList);


//       Arrays.asList() >> Its is a fixed size static List<>


        List<Integer> list = Arrays.asList(1, 2, 3, 4);
//        list.add(7); we have not add element in Arrays.asList bcx it is fixed sized arrayList
        list.set(2, 100); // but we have replace the element in list

        String[] name = {"sandeep", "kuldeep", "rishabh"};
        List<String> list1 = Arrays.asList(name);
        System.out.println("NAme List :: " + list1);


//      List.of() >>   Its return a unModified List
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

//        if we used List.of() we have not replace also bcz its return unModified List so we have not change the Element.
//        list.add(7); we have not add element in Arrays.asList bcx it is fixed sized arrayList
//        list.set(2, 100); // but we have replace the element in list


        // Convert List >> array

        List<Integer> integers1 = List.of(12, 3, 3, 4, 5, 6);
        Integer[] array = integers1.toArray(new Integer[integers1.size()]);
        System.out.println(Arrays.toString(array));

    }
}
