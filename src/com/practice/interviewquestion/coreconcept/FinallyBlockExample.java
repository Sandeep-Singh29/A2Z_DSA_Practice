package com.practice.interviewquestion.coreconcept;

/**
 * Author: SANDEEP
 * Date: 30/12/24
 */

public class FinallyBlockExample {
    public static int divide(int a, int b) {
        try {
            System.out.println("Insert Into Try Block");
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            return -1; // This will be executed before finally block
        } finally {
            System.out.println("Finally block is executed.");
        }
    }

    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println("Result: " + result);
    }
}
