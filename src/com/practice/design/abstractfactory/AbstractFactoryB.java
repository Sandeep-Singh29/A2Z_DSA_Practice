package com.practice.design.abstractfactory;

import com.practice.design.factory.ProdB;
import com.practice.design.factory.Product;

public class AbstractFactoryB implements AbstractFac {
    @Override
    public Product createProduct() {
        return new ProdB();
    }
}
