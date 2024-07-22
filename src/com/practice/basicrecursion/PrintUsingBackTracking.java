package com.practice.basicrecursion;

public class PrintUsingBackTracking {

    public static void main(String[] args) {
        int i=10;
        printData(i);
    }

    private static void printData(int i) {
        if(i<1) return;
        printData(i-1);
        System.out.println(i);
    }
}
