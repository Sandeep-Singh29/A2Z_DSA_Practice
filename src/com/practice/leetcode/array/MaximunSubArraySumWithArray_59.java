package com.practice.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class MaximunSubArraySumWithArray_59 {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        List<Integer> list = maximunsubArraySumArray(arr);
        System.out.println(list);
    }

    private static List<Integer> maximunsubArraySumArray(int[] arr) {
        List<Integer> list = new ArrayList<>();  // 4,-1,2,1 >> 6
        List<Integer> temp = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        long listCount = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
            if (max >= sum) {
                listCount = list.stream().mapToInt(Integer::intValue).sum();
                if (max >= listCount ) {
                    list.add(arr[i]);
                }
            }
            if (sum < 0) {
                list = new ArrayList<>();
                sum = 0;
            }
//            if(sum<max){
//                temp =new ArrayList<>(list);
//            }
        }
        return list;
    }
}
