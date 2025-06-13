package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 02/06/25
 */

public class MinimumIndexOfValidSplit_2780 {


    public static int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> leftSideMap = new HashMap<>();
        Map<Integer, Integer> rightSideMap = new HashMap<>();
        for (int v : nums) {
            rightSideMap.put(v, rightSideMap.getOrDefault(v, 0) + 1);
        }
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            int num = nums.get(i);
            leftSideMap.put(num, leftSideMap.getOrDefault(num, 0) + 1);
            rightSideMap.put(num, rightSideMap.get(num) - 1);
            int n1 = i + 1;
            int n2 = n - i - 1;
            if (leftSideMap.get(num) > n1 / 2 && rightSideMap.get(num) > n2 / 2) {
                return i;
            }
        }
        return -1;
    }

    public static int minimumIndexWay2UsingMajorityElement(List<Integer> nums) {
        int n = nums.size();
        int majorityElement = -1;
        int count = 0;
        for (int val : nums) {
            if (count == 0) {
                majorityElement = val;
                count++;
            } else if (val == majorityElement) {
                count++;
            } else {
                count--;
            }
        }
        int countMajority = 0;
        for (int val : nums) {
            if (val == majorityElement) {
                countMajority++;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (nums.get(i) == majorityElement) {
                count++;
            }
            int remainingCount = countMajority - count;
            int n1 = i + 1;
            int n2 = n - i - 1;
            if (count * 2 > n1 && remainingCount * 2 > n2) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 2);
        int minimumIndex = minimumIndex(list);
        System.out.println(minimumIndex);
        int minimumIndexWay2UsingMajorityElement = minimumIndexWay2UsingMajorityElement(list);
        System.out.println(minimumIndexWay2UsingMajorityElement);
    }

}
