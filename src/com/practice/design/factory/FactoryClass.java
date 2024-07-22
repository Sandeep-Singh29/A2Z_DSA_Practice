package com.practice.design.factory;

public class FactoryClass {

    public static Product createProduct(String type) {
        String upperCase = type.toUpperCase();
        type = upperCase;
        switch (type) {
            case "A":
                return new ProdA();
            case "B":
                return new ProdB();
            default:
                throw new IllegalArgumentException("Not Found Type");
        }

    }

}
