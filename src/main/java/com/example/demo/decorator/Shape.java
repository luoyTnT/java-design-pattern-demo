package com.example.demo.decorator;

/**
 * 几何中的图形（Shape）的子类有长方形（Rectangle），三角形（Triangle）和圆形（Circular）；
 * 颜色类：红色（Red）,黄色（Yellow），蓝色（Blue）。
 * 通过这些类，在不改变原有图形类的情况下，输出红色长方形，黄色三角形和蓝色圆形。
 */
public interface Shape {

    void drawShape();

}
