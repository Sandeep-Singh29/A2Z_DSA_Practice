package com.practice.leetcode.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    private final int[] arr;
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

    public int remove() {
        if (size == 0) {
            throw new RuntimeException("Heap Is Empty");
        }
        int peek = arr[0]; // store First Element
        swap(0, size - 1); // swap top and bottom
        size--;
        downHeapify(0);
        return peek;
    }

    private void downHeapify(int parentIdx) {
        if (parentIdx >= size) return; // base condition
        int leftChild = 2 * parentIdx + 1;  // get left Child Node Idx
        int rightChild = 2 * parentIdx + 2;  // // get right Child Node Idx
        int minIdx = parentIdx; // minDix for checking the Node which one is small
        if (leftChild < size && arr[leftChild] < arr[minIdx]) minIdx = leftChild;
        if (rightChild < size && arr[rightChild] < arr[minIdx]) minIdx = rightChild;
        if (parentIdx == minIdx) return;
        swap(parentIdx, minIdx); // swap
        downHeapify(minIdx); 
    }

    public int[] sort(MinHeap heap) {
        int len = size;
        int []arr = new int[size];
        for(int i=0;i<len;i++){
            int val = heap.remove();
            arr[i] = val;
        }
        return arr;
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
//        System.out.println("Remove Element : "+heap.remove());
//        System.out.println("Peek Element of Min Heap is : " + heap.peek());
//        System.out.println("Size Of Min Heap Is : " + heap.size());
        heap.add(4);
        heap.add(10);
//        System.out.println("Remove Element : "+heap.remove());
        heap.add(3);
//        System.out.println("Peek Element of Min Heap is : " + heap.peek());
//        System.out.println("Size Of Min Heap Is : " + heap.size());
        int[] sort = heap.sort(heap);
        System.out.println(Arrays.toString(sort));


    }

}