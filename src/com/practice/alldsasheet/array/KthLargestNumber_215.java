package com.practice.alldsasheet.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 03/02/25
 */

public class KthLargestNumber_215 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int kthLargest = findKthLargest(nums, k);
        System.out.println(kthLargest);
    }

    public static int findKthLargest(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int v : nums) {
            list.add(v);
        }
        Collections.sort(list);
        Collections.reverse(list);
        return list.get(k - 1);
    }



}
