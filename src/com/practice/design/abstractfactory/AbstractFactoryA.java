package com.practice.design.abstractfactory;

import com.practice.design.factory.ProdA;
import com.practice.design.factory.Product;

public class AbstractFactoryA implements AbstractFac {
    @Override
    public Product createProduct() {
        return new ProdA();
    }
}
