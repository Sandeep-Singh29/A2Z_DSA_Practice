package com.practice.leetcode.string;

import java.util.Stack;

public class MaximunNestingDepth_1614 {

    public static int maxDepth(String s) {
        int max = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                max = Math.max(count, max);
            } else if (c == ')') {
                count--;
                max = Math.max(count, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
//        int i = maxDepth(s);
//        System.out.println(i);
        int stack = maxDepthStack(s);
        System.out.println(stack);
    }

    private static int maxDepthStack(String s) {
        int max = 0;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('){
                stack.push(c);
                max = Math.max(max,stack.size());
            }else if(c==')'){
                stack.pop();
            }
        }
        return max;
    }
}
