package com.practice.array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int num = singleNumber(nums);
        System.out.println(num);
    }

    private static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                return m.getKey();
            }
        }
        return 0;
    }
}
