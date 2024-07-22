package com.practice.basicrecursion;

public class SumOfNthNumber {
    public static void main(String[] args) {
        int i =4;
        int sum =0;
        sumOfNth(i,sum);
    }

    private static void sumOfNth(int i, int sum) {
        if (i<1){
            System.out.println(sum); return;
        }
        sumOfNth(i-1 ,sum+i);
    }
}
