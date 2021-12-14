package com.example.demo.decorator;

public class YellowColor extends Color {
    public YellowColor(Shape shape) {
        super(shape);
    }

    @Override
    public void drawShape() {
        this.shape.drawShape();
        System.out.println("颜色为黄色");
    }
}
