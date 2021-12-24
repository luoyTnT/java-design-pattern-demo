package com.example.demo.visitor;

import java.util.ArrayList;
import java.util.List;

//对象结构角色
public class ObjectStructure {
    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (Element element : list) {
            element.accept(visitor);
        }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }
}