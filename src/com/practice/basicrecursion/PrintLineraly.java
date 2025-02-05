package com.practice.basicrecursion;

public class PrintLineraly {
    public static void main(String[] args) {
        int i = 1;
        int target = 100;
//        print1toN(i, target);
        printNto1(i, target);
    }

    private static void print1toN(int i, int target) {
        if (i == target) return;  // BAse Condition
        System.out.println(i);  // Opertation
        print1toN(i + 1, target); // Method Call
    }

    private static void printNto1(int i, int target) {
        if (i == target) return;  // BAse Condition
        printNto1(i + 1, target); // Method Call
        System.out.println(i);  // Opertation
    }
}
