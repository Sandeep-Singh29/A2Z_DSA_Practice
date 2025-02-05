package com.practice.leetcode.array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementArray_215 {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 5, 6, 4};
        int k = 2;
//        int ele = findKLargestElement(arr,k);
//        System.out.println(ele);
        int pri = findKLargestElementUsingPriorty(arr, k);
        System.out.println(pri);
    }

    private static int findKLargestElementUsingPriorty(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        System.out.println(pq);
        return pq.peek();
    }

    private static int findKLargestElement(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n - k];
    }
}
