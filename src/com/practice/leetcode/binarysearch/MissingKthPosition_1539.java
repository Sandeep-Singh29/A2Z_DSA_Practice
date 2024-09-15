package com.practice.leetcode.binarysearch;

import java.util.*;

public class MissingKthPosition_1539 {

    private static int findKthPositive(int[] arr, int k) {
        int num = 1;
        int i = 0;
        int len = arr.length;
        while (i<len && k>0){
            if(arr[i]==num){
                i++;
            }else{
                k--;
            }
            num++;
        }
        while(k>0){
            num++;
            k--;
        }
        return num-1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 3;
        int kthPositive = findKthPositive(arr, k);
        System.out.println(kthPositive);

    }
}
