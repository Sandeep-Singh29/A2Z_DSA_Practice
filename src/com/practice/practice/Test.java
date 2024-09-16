package com.practice.practice;

import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        Object o = properties.get("java.specification.version");
        System.out.println(o);
//        System.out.println(properties);

    }
}
