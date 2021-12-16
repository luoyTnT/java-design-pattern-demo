package com.example.demo.template;

public abstract class Template {

    /**
     * 外部调用模板
     */
    public void templateMethod() {
        this.method1();
        this.method2();
        this.method3();
    }

    public void method1() {
        System.out.println("共用事件");
    }

    /**
     * 非共用的事件
     */
    public abstract void method2();

    public abstract void method3();

}
