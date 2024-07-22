package com.practice.design;

import com.practice.design.factory.FactoryClass;
import com.practice.design.factory.Product;

public class FactoryTest {
    public static void main(String[] args) {
        String type = "a";
        Product product = FactoryClass.createProduct(type);
        product.use();
    }
}
