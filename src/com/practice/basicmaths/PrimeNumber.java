package com.practice.basicmaths;

public class PrimeNumber {

    public static void main(String[] args) {
        int num = 15;
        String s = isPrimeNumber(num);
        System.out.println(s);
    }

    private static String isPrimeNumber(int num) {
        if (num <= 1) {
            return "Number is Not Prime";
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return "Number is Not Prime";
            }
        }
        return "Number is Prime";
    }

}
