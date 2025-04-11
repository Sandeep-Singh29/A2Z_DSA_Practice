package com.practice.collectionframework.list;

import java.util.Stack;

/**
 * Author: Sandeep Singh
 * Date: 09/04/25
 */

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Integer pop = stack.pop();
        System.out.println("POP :: " + pop);
        System.out.println("PEEK :: " + stack.peek());
        System.out.println("SIZE :: " + stack.size());
        System.out.println("EMPTY :: " + stack.isEmpty());
        stack.addFirst(100);
        stack.addLast(200);
        System.out.println(stack);
        System.out.println("PEEK :: " + stack.peek());
    }
}
