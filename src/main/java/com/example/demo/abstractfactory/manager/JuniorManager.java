package com.example.demo.abstractfactory.manager;

public class JuniorManager implements ProductManager {
    @Override
    public void plan() {
        System.out.println("初级产品经理方案");
    }
}
