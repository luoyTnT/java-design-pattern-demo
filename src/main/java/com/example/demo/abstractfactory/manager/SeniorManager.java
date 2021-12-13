package com.example.demo.abstractfactory.manager;

public class SeniorManager implements ProductManager {
    @Override
    public void plan() {
        System.out.println("高级产品经理方案");
    }
}
