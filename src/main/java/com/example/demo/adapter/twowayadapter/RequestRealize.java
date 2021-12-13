package com.example.demo.adapter.twowayadapter;

public class RequestRealize implements TwoWayRequest {
    @Override
    public void twoWayRequest() {
        System.out.println("转换到适配请求");
    }
}
