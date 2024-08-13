package com.practice.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber_136 {

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int v : nums) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) return m.getKey();
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2,4,1};
//        int n = singleNumber(arr);
//        System.out.println(n);
        int n = singleNumberWay2(arr);
        System.out.println(n);
    }

    private static int singleNumberWay2(int[] arr) {   // 1 1 2 2 4
       int xor =0;
       for(int v : arr){
          xor = xor ^ v;
       }
            return  xor;
    }
}
