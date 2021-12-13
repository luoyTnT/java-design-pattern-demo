package com.example.demo.adapter.twowayadapter;

/**
 * 双向适配器
 * 模拟请求互相转换
 */
public class TargetRealize implements TwoWayTarget {
    @Override
    public void request() {
        System.out.println("转换为原请求");
    }
}
