package com.example.demo.abstractfactory.manager;

public class IntermediateManager implements ProductManager {
    @Override
    public void plan() {
        System.out.println("中级产品经理方案");
    }
}
