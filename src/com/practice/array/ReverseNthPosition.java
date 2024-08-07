package com.practice.array;

import java.util.Arrays;

public class ReverseNthPosition {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8}; // 4 5 6 7 8 1 2 3
        int k=3;
        int newarr[] = rotate(k,arr);
        System.out.println(Arrays.toString(newarr));
    }

    private static int[] rotate(int k,int[]arr) {
        k = k % arr.length;
        int arr1[] = reverse(arr,0,k-1);
        System.out.println("1st Reverse before k part :  "+Arrays.toString(arr1));
        int arr2[] = reverse(arr,k,arr.length-1);
        System.out.println("2st Reverse after k part :  "+Arrays.toString(arr2));
        int mergeReverse[] = reverse(arr,0,arr.length-1);
        System.out.println("Final Reverse :  "+Arrays.toString(mergeReverse));
        return mergeReverse;
    }

    private static int[] reverse(int[] arr, int start , int end) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
        return arr;
    }
}
