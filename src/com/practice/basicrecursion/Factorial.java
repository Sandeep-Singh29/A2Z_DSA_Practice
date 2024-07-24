package com.practice.basicrecursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        int res =0;
        int fac = facttorial(n);
        System.out.println(fac);
    }

    private static int facttorial(int n) {
        if(n==0){
            return 1;
        }
        facttorial(n-1);
        return  n * facttorial(n - 1);
    }
}
