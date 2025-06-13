package com.practice.recrointerviewquestion;

import java.util.Stack;

/**
 * Author: Sandeep Singh
 * Date: 23/05/25
 */

public class Remove_K_Digits_402 {

    public static void main(String[] args) {
        String num = "10200";
        int k = 1;
        String removeDigits = removeKdigits(num, k);
        System.out.println(removeDigits);
    }

    // 2
// 1 2 1
    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            // remove left
            while (!stack.isEmpty() && k > 0 && ch < stack.peek()) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            // remove k element in right side
            if (k > 0) {
                stack.pop();
                k--;
            } else {
                // Adding element in StringBuilder
                sb.insert(0,stack.pop());
            }
        }
        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.isEmpty() ? "0" : sb.toString();
    }
}
