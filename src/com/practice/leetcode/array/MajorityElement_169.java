package com.practice.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 5};
//        int ele = findMajorityElement(arr);
//        System.out.println(ele);
        int data = mooreVotingAlgo(arr);
        System.out.println(data);
    }

    private static int mooreVotingAlgo(int[] nums) {
        int ele=0;
        int count = 0;
        for (int v : nums) {
            if(count==0){
                ele = v;
                count++;
            } else if (ele!=v) {
                count--;
            }else {
                count++;
            }
        }
        return ele;
    }

    private static int findMajorityElement(int[] nums) {
        int n = (nums.length - 1) / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int v : nums) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > n) {
                return m.getKey();
            }
        }
        return 0;
    }
}