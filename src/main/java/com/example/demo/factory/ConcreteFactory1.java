package com.example.demo.factory;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("工厂1生成产品A1");
        return new ProductA1();
    }
}
