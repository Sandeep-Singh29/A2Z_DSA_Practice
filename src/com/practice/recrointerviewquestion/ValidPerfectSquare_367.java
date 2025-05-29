package com.practice.recrointerviewquestion;

/**
 * Author: Sandeep Singh
 * Date: 22/05/25
 */

public class ValidPerfectSquare_367 {

    public static boolean bruteForceSolution(int num) {  // Give time limit exceed
        int oddNumber = 1;
        int sum = 1;
        while (sum <= num) {
            if (sum == num) {
                return true;
            }
            oddNumber += 2;
            sum += oddNumber;
        }
        return false;
    }

    public static boolean perfectSquare(int num) {
        if (num < 2) return true;
        int left = 2;
        int right = num / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 16;
        boolean perfectSquare = bruteForceSolution(num);
        System.out.println(perfectSquare);
        boolean perfectSquare1 = perfectSquare(num);
        System.out.println(perfectSquare1);
    }
}
