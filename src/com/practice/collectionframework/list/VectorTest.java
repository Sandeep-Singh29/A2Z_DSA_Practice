package com.practice.collectionframework.list;

import java.util.Vector;

/**
 * Author: Sandeep Singh
 * Date: 09/04/25
 */

public class VectorTest {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(3,8); // 3 capacity and increase to 3 means 3+3=6
        int capacity = vector.capacity();// get Capacity
        System.out.println("start capacity :: " + vector.capacity());
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("capacity :: " + vector.capacity());
        vector.add(4);
        System.out.println("capacity :: " + vector.capacity());

    }
}
