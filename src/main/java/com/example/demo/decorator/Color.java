package com.example.demo.decorator;

public abstract class Color implements Shape {

    protected Shape shape;

    public Color(Shape shape) {
        this.shape = shape;
    }

}
