package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 04/06/25
 */

public class RabbitsInForest_781 {

    public static int numRabbits(int[] answers) {
        int totalRabbit = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : answers) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int rabbitAnswer = entry.getKey();      // The answer given by rabbit
            int count = entry.getValue();           // How many rabbits gave that answer
            int groupSize = rabbitAnswer + 1;
            int groups = (int) Math.ceil((double) count / groupSize);
            totalRabbit += groups * groupSize;
        }
        return totalRabbit;
    }

    public static void main(String[] args) {
        int[] answers = {1, 1, 2};
        int numRabbits = numRabbits(answers);
        System.out.println(numRabbits);
    }

}
