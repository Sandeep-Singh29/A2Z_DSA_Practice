package com.practice.basicrecursion;

public class PrintName5Times {
    public static void main(String[] args) {
        int count = 0;
        printName(count);
    }

    private static void printName(int count) {
        if (count >= 5) return;  // Base Condition
        count++;  //  Increment
        System.out.println("Sandeep"); // Operation
        printName(count);   // Method Calling

    }
}
