package com.practice.design;

import com.practice.design.abstractfactory.AbstractFac;
import com.practice.design.abstractfactory.AbstractFactoryA;
import com.practice.design.abstractfactory.AbstractFactoryB;
import com.practice.design.factory.Product;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        AbstractFac abstractFactoryA = new AbstractFactoryA();
        Product product = abstractFactoryA.createProduct();
        product.use();
        AbstractFac abstractFactoryB = new AbstractFactoryB();
        Product product1 = abstractFactoryB.createProduct();
        product1.use();

    }
}
