package com.example.demo.prototype;

public class Prototype implements Cloneable {

    public Prototype(){
        System.out.println("原型创建成功");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("原型复制成功");
        return super.clone();
    }
}
