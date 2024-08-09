package com.practice.gfg.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInAnArray {
    public static void main(String[] args) {
        int arr[] = {6 ,5, 4, 3, 2, 1};  // 10 22 12 3 0 6
//        List<Integer> res = leaderEle(arr);
//        System.out.println(res);
        List<Integer> res = leaderEleOptimal(arr);
        System.out.println(res);
    }

    private static List<Integer> leaderEleOptimal(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i= arr.length-1; i>=0;i--){
            max = Math.max(arr[i],max);
            if(arr[i]>=max){
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }

    private static List<Integer> leaderEle(int[] arr) {
        List<Integer> list = new ArrayList<>();     // 16,17,4,3,5,2
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    flag = false;
                   break;
                }
                if(arr[i]>arr[j]){
                    flag = true;
                }
                if(flag && j== arr.length-1){
                    list.add(arr[i]);
                }
            }
        }
        list.add(arr[arr.length-1]);
        return list;
    }
}
