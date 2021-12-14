package com.example.demo.decorator;

public class BlueColor extends Color {
    public BlueColor(Shape shape) {
        super(shape);
    }

    @Override
    public void drawShape() {
        this.shape.drawShape();
        System.out.println("颜色为蓝色");
    }
}
