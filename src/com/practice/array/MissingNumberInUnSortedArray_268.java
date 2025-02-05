package com.practice.array;

import java.util.Arrays;

public class MissingNumberInUnSortedArray_268 {

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        for (int v : nums) {
            if (v != start) {
                return start;
            }
            start++;
        }
        return start;
    }


    private static int missingNumberWay2(int[] num) {
        int hasArray[] = new int[num.length + 1];
        Arrays.sort(num);
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (sum == num[i]) {
                hasArray[i] = 1;
                sum++;
            }
        }
        int i = 0;
        for (i = 0; i < hasArray.length; i++) {
            if (hasArray[i] == 0) {
                return i;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int num[] = {0, 1, 2, 4, 5};
//        int nums = missingNumber(num);
//        System.out.println(nums);
//        int nums = missingNumberWay2(num);
//        System.out.println(nums);
//        int way3 = missingNumberWay3(num);
//        System.out.println(way3);
        int way3 = missingNumberUsingXOR(num);
        System.out.println(way3);
    }

    private static int missingNumberUsingXOR(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
            xor ^= i;
        }
        xor ^= n;

        return xor;
    }

    private static int missingNumberWay3(int[] num) {
        int sum = 0;
        int length = num.length;
        for (int i = 0; i < length; i++) {
            sum += num[i];
        }
        int differnce = ((length) * (length + 1) / 2) - sum;
        sum = Math.abs(differnce);
        return sum;
    }
}




