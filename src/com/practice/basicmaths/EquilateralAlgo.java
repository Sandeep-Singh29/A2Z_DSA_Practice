package com.practice.basicmaths;

public class EquilateralAlgo {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int gcd = gcd(a, b);
        System.out.println(gcd);
    }

    private static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        if (a == 0) return b;
        return a;
    }
}
