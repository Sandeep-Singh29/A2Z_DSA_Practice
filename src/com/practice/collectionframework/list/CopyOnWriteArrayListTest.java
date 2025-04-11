package com.practice.collectionframework.list;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Author: Sandeep Singh
 * Date: 09/04/25
 */

public class CopyOnWriteArrayListTest {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("burger");
        copyOnWriteArrayList.add("pizza"); 
        copyOnWriteArrayList.add("roll");

        for (String str : copyOnWriteArrayList) {  // if we perform this in arrayList and linkedList they give me
            if (str.equals("pizza")) {             // concurrentModificationException
                copyOnWriteArrayList.add("cold-drink");
                copyOnWriteArrayList.add("garlic bread");
                System.out.println("Element add when pizza is there..");
            }
        }
        System.out.println("Updated List :: " + copyOnWriteArrayList);

    }
}
