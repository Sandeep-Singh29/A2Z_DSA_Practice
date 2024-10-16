package com.practice.leetcode.heaps;

import java.util.Arrays;

/**
 * Author: SANDEEP
 * Date: 14-10-2024
 */
/*

@Min Heap Main Minnimun Element Top par rahta hai
@Jab Koi element add hota hai to left ya right node main add hota hai after add element
check karta hai elemet large hai parent sa ki nahi
@Agar new element minimun hota hai parent root sa to suffer kar diya jata hai jab tak Parent root
ka element large hai

***
How can i get a Parent Value
 int parent = (child-1)/2; // child is index
*/

class MinHeap {
    private int arr[];
    private int size;

    MinHeap(int capacity) { // This Constructor is used for Capactity of Array
        arr = new int[capacity];
        size = 0;
    }

    public void add(int element) {
        if (size == arr.length) {
            throw new RuntimeException("Min Heap is Full");
        }
        arr[size++] = element;
        upHeapify(size - 1);
    }

    private void upHeapify(int idx) { //idx is ?? child and child root is parent
        int child = idx;
        if (child == 0) { // base condition
            return;
        }
        int parent = (child - 1) / 2;
        if (arr[child] < arr[parent]) {
            swap(parent, child);
            upHeapify(parent);
        }
    }

    private void swap(int parent, int child) {
        int temp = arr[parent];
        arr[parent] = arr[child];
        arr[child] = temp;
    }

    public int size() {
        return size;
    }

    public int peek() {
        if (size == 0) {
            throw new RuntimeException("Min Heap is Empty");
        }
        return arr[0];
    }
}

public class ImplementationHeapPriortyQueue {

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
//        System.out.println("Size Of Min Heap Is : " + heap.size());
//        System.out.println("Peek Element of Min Heap is : " + heap.peek());
        heap.add(1);
        heap.add(2);
        heap.add(0);
        System.out.println("Peek Element of Min Heap is : " + heap.peek());
        System.out.println("Size Of Min Heap Is : " + heap.size());
        heap.add(4);
        heap.add(10);
        heap.add(3);
        System.out.println("Peek Element of Min Heap is : " + heap.peek());
        System.out.println("Size Of Min Heap Is : " + heap.size());
    }

}