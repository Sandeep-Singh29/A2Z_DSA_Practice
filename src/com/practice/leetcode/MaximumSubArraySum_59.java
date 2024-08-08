package com.practice.leetcode;

public class MaximumSubArraySum_59 {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = maximunsubArraySum(arr);
        System.out.println(sum);
    }

    private static int maximunsubArraySum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            max = Math.max(max,sum);
            if (sum<0){
                sum=0;
            }
        }
        return max;
    }
}
