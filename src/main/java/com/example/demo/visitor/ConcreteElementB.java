package com.example.demo.visitor;

//具体元素B类
public class ConcreteElementB implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationB() {
        return "具体元素B的操作。";
    }
}