package com.practice.array;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int result[] = rotate(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] rotate(int[] nums) {
//        int temp = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            arr[i - 1] = arr[i];
//        }
//        arr[arr.length - 1] = temp;
//        return arr;
        int k =3;
        int newarr[] = new int[nums.length];
        int j=0;
        for(int i=k+1 ; i<nums.length;i++){
            newarr[j] = nums[i];
            j++;
        }
        for(int i=0;i<=k;i++){
            newarr[j] = nums[i];
            j++;
        }
        return newarr;
    }
}
