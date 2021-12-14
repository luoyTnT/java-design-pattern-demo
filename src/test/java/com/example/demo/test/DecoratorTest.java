package com.example.demo.test;

import com.example.demo.decorator.*;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    void decoratorTest1() {
        Shape shape = new Rectangle();
        Color color = new RedColor(shape);
        color.drawShape();
        System.out.println("=====================");

        shape = new Triangle();
        color = new YellowColor(shape);
        color.drawShape();
        System.out.println("=====================");

        shape = new Circular();
        color = new BlueColor(shape);
        color.drawShape();
    }

}
