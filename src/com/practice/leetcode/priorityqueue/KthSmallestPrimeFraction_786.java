package com.practice.leetcode.priorityqueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Author: Sandeep Singh
 * Date: 17/06/25
 */

public class KthSmallestPrimeFraction_786 {

    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                double div = (double) arr[i] / arr[j];
                pq.offer(new double[]{div, (double) arr[i], (double) arr[j]});
                if (pq.size() > k)
                    pq.poll();
            }
        }
        double[] vec = pq.peek();
        int[] result = new int[2];
        result[0] = (int) vec[1];
        result[1] = (int) vec[2];
        return result;
    }

    public static int[] kthSmallestPrimeFractionOptimal(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<double[]> pq = new PriorityQueue<>(Comparator.comparingDouble(a -> a[0]));
        for (int i = 0; i < n; i++) {
            pq.offer(new double[]{1.0 * arr[i] / arr[n - 1], (double) i, (double) (n - 1)});
        }
        int smallest = 1;
        while (smallest < k) {
            double[] vec = pq.poll();
            int i = (int) vec[1];
            int j = (int) vec[2] - 1;
            pq.offer(new double[]{1.0 * arr[i] / arr[j], (double) i, (double) j});
            smallest++;
        }
        double[] vec = pq.peek();
        int i = (int) vec[1];
        int j = (int) vec[2];
        return new int[]{arr[i], arr[j]};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int k = 3;
        int[] ints = kthSmallestPrimeFraction(arr, k);
        System.out.println(Arrays.toString(ints));
        int[] fractionOptimal = kthSmallestPrimeFractionOptimal(arr, k);
        System.out.println(Arrays.toString(fractionOptimal));
    }

}
