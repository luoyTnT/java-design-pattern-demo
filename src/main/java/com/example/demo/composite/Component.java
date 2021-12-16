package com.example.demo.composite;

public interface Component {

    void add(Component component);

    void delete(Component component);

    Component getChild(int i);

    void operation();

}
