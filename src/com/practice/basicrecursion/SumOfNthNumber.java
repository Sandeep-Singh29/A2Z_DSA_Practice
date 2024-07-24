package com.practice.basicrecursion;

public class SumOfNthNumber {
    public static void main(String[] args) {
        int i = 4;
        int sum = 0;
//        sumOfNth(i,sum);
        int n = 3;
        int num = sum(n);
        System.out.println(num);
    }

    private static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    private static void sumOfNth(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sumOfNth(i - 1, sum + i);
    }


}
