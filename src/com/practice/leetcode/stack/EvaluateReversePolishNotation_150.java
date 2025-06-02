package com.practice.leetcode.stack;

import java.util.Stack;

/**
 * Author: Sandeep Singh
 * Date: 29/05/25
 */

public class EvaluateReversePolishNotation_150 {

    public static int evalRPN(String[] tokens) {
        Stack<Long> stack = new Stack<>();
        for (String ch : tokens) {
            if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
                Long first = stack.pop();
                Long second = stack.pop();
                char operator = ch.charAt(0);
                long calculatePreviousTwoElement = findCalculate(second, first, operator);
                stack.push(calculatePreviousTwoElement);
            } else {
                stack.push(Long.parseLong(ch));
            }
        }
        return stack.pop().intValue();
    }

    private static long findCalculate(Long second, Long first, char operator) {
        if (operator == '+') return second + first;
        else if (operator == '-') return second - first;
        else if (operator == '*') return second * first;
        return second / first;
    }

    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int evaled = evalRPN(tokens);
        System.out.println(evaled);
    }

}
