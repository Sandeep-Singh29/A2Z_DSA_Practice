package com.practice.basicmaths;

public class GCDandHCF {

    private static int highestCommonFactor(int n1, int n2) {
        int highestCommonFactor = 0;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                highestCommonFactor = i;
            }
        }
        return highestCommonFactor;
    }

    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 40;
        int num = highestCommonFactor(n1, n2);
        System.out.println(num);
    }


}
