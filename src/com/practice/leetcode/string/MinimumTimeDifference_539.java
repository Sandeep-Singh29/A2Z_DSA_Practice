package com.practice.leetcode.string;

import java.util.Arrays;
import java.util.List;

public class MinimumTimeDifference_539 {

    public static int findMinDifference(List<String> timePoints) {
        int minArr[] = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            String getTime = timePoints.get(i);
            String hour = getTime.split(":")[0];
            String min = getTime.split(":")[1];
            int totalMin = (Integer.parseInt(hour) * 60) + Integer.parseInt(min);
            minArr[i] = totalMin;
        }
        Arrays.sort(minArr);
        System.out.println(Arrays.toString(minArr));
        int minMinutes = Integer.MAX_VALUE;
        for (int i = 1; i < minArr.length; i++) {
            int difference = minArr[i] - minArr[i - 1];
            minMinutes = Math.min(minMinutes, difference);
        }
        return Math.min(minMinutes, (24 * 60 - minArr[minArr.length - 1]) + minArr[0]);
    }

    public static void main(String[] args) {
        List<String> list = List.of("23:59", "00:00");
        int minDifference = findMinDifference(list);
        System.out.println(minDifference);
    }
}
