package com.example.demo.adapter.twowayadapter;

public class TwoWayAdapter implements TwoWayRequest, TwoWayTarget {

    private TwoWayTarget twoWayTarget;
    private TwoWayRequest twoWayRequest;

    public TwoWayAdapter(TwoWayTarget twoWayTarget) {
        this.twoWayTarget = twoWayTarget;
    }

    public TwoWayAdapter(TwoWayRequest twoWayRequest) {
        this.twoWayRequest = twoWayRequest;
    }

    @Override
    public void twoWayRequest() {
        twoWayTarget.request();
    }

    @Override
    public void request() {
        twoWayRequest.twoWayRequest();
    }
}
