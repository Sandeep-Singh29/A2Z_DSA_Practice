package com.practice.multithreding.lambda;

/**
 * Author: Sandeep Singh
 * Date: 18/02/25
 */

@FunctionalInterface
interface Student{

    String name();

}

public class WithOutLambdaExpression {
    public static void main(String[] args) {

        // Give Implementation in Old ways when we have not using Lambda
        Student student = new Student() {
            @Override
            public String name() {
                return "Sandeep";
            }
        };
        System.out.println(student.name());


    }
}
