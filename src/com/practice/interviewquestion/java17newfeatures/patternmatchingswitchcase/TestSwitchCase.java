package com.practice.interviewquestion.java17newfeatures.patternmatchingswitchcase;

/**
 * Author: Sandeep Singh
 * Date: 19/03/25
 */

public class TestSwitchCase {

    static void printType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Boolean b -> System.out.println("Boolean: " + b);
            case Float f -> System.out.println("Float: " + f);
            case null -> System.out.println("Null value");
            default -> System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        printType(10);
        printType("Hello");
        printType(null);
        printType(true);
        printType(12.40F);
        printType(12.0);
    }
}
