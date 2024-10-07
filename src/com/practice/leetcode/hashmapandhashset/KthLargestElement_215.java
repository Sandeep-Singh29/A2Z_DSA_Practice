package com.practice.leetcode.hashmapandhashset;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Author: SANDEEP
 * Date: 07-10-2024
 */

public class KthLargestElement_215 {

    private static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            pq.remove();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int kthLargest = findKthLargest(nums, k);
        System.out.println(kthLargest);
    }

}