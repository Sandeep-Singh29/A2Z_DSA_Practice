package com.practice.recrointerviewquestion;

/**
 * Author: Sandeep Singh
 * Date: 24/05/25
 */

public class NumberSumPower_1780 {

    public static void main(String[] args) {
        int n = 91;
        boolean checkPowersOfThree = checkPowersOfThree(n);
        System.out.println(checkPowersOfThree);
    }


    public static boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
