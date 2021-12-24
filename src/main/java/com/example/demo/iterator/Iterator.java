package com.example.demo.iterator;

//抽象迭代器
public interface Iterator {
    Object first();

    Object next();

    boolean hasNext();
}