package com.practice.leetcode.hashmapandhashset;

import java.util.*;

/**
 * Author: SANDEEP
 * Date: 07/10/24
 */

public class KClosestPoint_973 {

    private static int[][] kClosest(int[][] points, int k) {
        int row = points.length;
        int column = points[0].length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Integer> freqDistance = new HashMap<>();
        for (int[] point : points) {
            int i1 = point[0] * point[0];  // cordinate 1 Square
            int i2 = point[1] * point[1];  // cordinate 1 Square
            int distance = i1 + i2;        // add both cordinate
            freqDistance.put(distance, freqDistance.getOrDefault(distance, 0) + 1);
            pq.add(distance);
            map.put(distance, Arrays.asList(point[0], point[1])); // put cordinate and correspondence of array value
            if (pq.size() > k) {
                pq.remove();
            }
        }
        int[][] res = new int[k][2];
        int i = 0;
        while (!pq.isEmpty()) {
            int repeatDistance = freqDistance.get(pq.remove());
            for (int d = 0; d < repeatDistance; d++) {
                List<Integer> list = map.get(pq.remove());
                res[i][0] = list.get(0);
                res[i][1] = list.get(1);
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}, {2, -2}};
        int k = 2;
        int[][] ints = kClosest(points, k);
        int r = ints.length;
        int c = ints[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(ints);
    }
}
