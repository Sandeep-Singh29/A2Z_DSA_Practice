package com.practice.leetcode.heaps;

import java.util.*;

/**
 * Author: SANDEEP
 * Date: 07-10-2024
 */

class Triplet implements Comparable<Triplet> {
    int d;
    int x;
    int y;

    Triplet(int d, int x, int y) {
        this.d = d;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Triplet t) {
        return this.d - t.d;
    }
}

public class KClosestPoint_973 {

    private static int[][] kClosest(int[][] points, int k) {
        int len = points.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<Integer, Integer> freqDistance = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int c1 = points[i][0] * points[i][0];
            int c2 = points[i][1] * points[i][1];
            int distance = c1 + c2;
            freqDistance.put(distance, freqDistance.getOrDefault(distance, 0) + 1);
            pq.add(distance);
            map.put(distance, Arrays.asList(points[i][0], points[i][1]));
            if (pq.size() > k) pq.remove();
        }
        System.out.println(freqDistance);
        System.out.println(pq);
        System.out.println(map);
        int res[][] = new int[pq.size()][2];
        int c = 0;
        if (map.size() == 1) return points;
        for (Map.Entry<Integer, Integer> m : freqDistance.entrySet()) {
            if (m.getValue() > 1) {
                for (int i = 0; i < len; i++) {
                    int c1 = points[i][0] * points[i][0];
                    int c2 = points[i][1] * points[i][1];
                    int distanceC = c1 + c2;
                    if (distanceC == pq.peek()) {
                        res[c][0] = points[i][0];
                        res[c][1] = points[i][1];
                        c++;
                        pq.remove();
                    }
                }
            }
        }
        c = 0;
        if (pq.isEmpty()) return res;
        while (!pq.isEmpty()) {
            List<Integer> list = map.get(pq.remove());
            res[c][0] = list.get(0);
            res[c][1] = list.get(1);
            c++;
        }
        return res;
    }


    private static int[][] kClosestUsingTriplet(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int distance = x * x + y * y;
            pq.add(new Triplet(distance, x, y));
            if (pq.size() > k) pq.remove();
        }
        int res[][] = new int[k][2];
        int i = 0;
        while (!pq.isEmpty()) {
            Triplet getData = pq.remove();
            res[i][0] = getData.x;
            res[i][1] = getData.y;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
//        int[][] ints = kClosest(points, k);
        int[][] ints = kClosestUsingTriplet(points, k);
        int r = ints.length;
        int c = ints[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

}