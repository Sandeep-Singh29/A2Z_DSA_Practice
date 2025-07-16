package com.practice.multithreding.lambda;

/**
 * Author: Sandeep Singh
 * Date: 18/02/25
 */

@FunctionalInterface
interface Vehicle {

    String getName();

}
@FunctionalInterface
interface Calculator{
    int add(int a,int b);
}


public class LambdaExpression {
    public static void main(String[] args) {

        // Way 1
        Vehicle vehicle = () -> {
            return "AUDI";
        };
        System.out.println(vehicle.getName());

        Calculator cal = (a,b)-> a+b;
        int add = cal.add(4, 4);
        System.out.println(add);

    }
}
