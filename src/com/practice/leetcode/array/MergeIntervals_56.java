package com.practice.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals_56 {

    public static int[][] merge(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < r; i++) {
               int start = arr[i][0];
               int end = arr[i][1];
             if(list.isEmpty()){
                 list.add(Arrays.asList(start,end));
             }
             if(!list.isEmpty()){
                 if(list.get(i).get(1)>arr[i][0]){
//                     list.add(list);
                 }
             }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merge = merge(intervals);
        System.out.println(merge);
    }
}
