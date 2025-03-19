package com.practice.multithreding.lambda;

/**
 * Author: Sandeep Singh
 * Date: 18/02/25
 */

@FunctionalInterface
interface Vehicle {

    String getName();

}

public class LambdaExpression {
    public static void main(String[] args) {

        // Way 1
        Vehicle vehicle = () -> {
            return "AUDI";
        };
        System.out.println(vehicle.getName());


    }
}
