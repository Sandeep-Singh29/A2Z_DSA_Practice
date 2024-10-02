package com.practice.leetcode.string;

/**
 * Author: SANDEEP
 * Date: 02-10-2024
 */

public class AddTwoNumber_415 {

    private static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        String ans ="";
        while (i >= 0 || j >= 0 || carry != 0) {
            int vali = i >= 0 ? num1.charAt(i) - '0' : 0;
            int valj = j >= 0 ? num2.charAt(j) - '0' : 0;
            i--;
            j--;
            int sum = vali+valj+carry;
            ans = (sum %10)+ans;
            carry = sum/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        String num1 = "19234", num2 = "991";
        String string = addStrings(num1, num2);
        System.out.println(string);
    }

}