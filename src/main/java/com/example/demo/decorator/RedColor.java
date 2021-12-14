package com.example.demo.decorator;

public class RedColor extends Color {
    public RedColor(Shape shape) {
        super(shape);
    }

    @Override
    public void drawShape() {
        this.shape.drawShape();
        System.out.println("颜色为红色");
    }
}
