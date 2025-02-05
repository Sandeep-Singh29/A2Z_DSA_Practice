package com.practice.leetcode.string;

import java.util.Stack;

public class RemoveOutermostparentheses_1021 {

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int parenthesesCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(') {
                if (parenthesesCount > 0) {
                    result.append(currentChar);
                }
                parenthesesCount++;
            } else {
                parenthesesCount--;
                if (parenthesesCount > 0) {
                    result.append(currentChar);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";  // (()())(())
//        String string = removeOuterParentheses(s);
//        System.out.println(string);
        String string = removeOuterParenthesesUsingStack(s);
        System.out.println(string);
    }

    private static String removeOuterParenthesesUsingStack(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (stack.size() > 0) {
                    stringBuilder.append(c);
                }
                stack.push(c);
            } else {
                stack.pop();
                if (stack.size() > 0) {
                    stringBuilder.append(c);
                }
            }
        }
        return stringBuilder.toString();
    }
}
