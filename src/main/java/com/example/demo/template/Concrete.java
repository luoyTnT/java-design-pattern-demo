package com.example.demo.template;

public class Concrete extends Template {
    @Override
    public void method2() {
        System.out.println("非共用事件实现1");
    }

    @Override
    public void method3() {
        System.out.println("非共用事件实现2");
    }
}
