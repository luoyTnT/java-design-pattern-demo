package com.example.demo.factory;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("工厂2生成产品A2");
        return new ProductA2();
    }
}
