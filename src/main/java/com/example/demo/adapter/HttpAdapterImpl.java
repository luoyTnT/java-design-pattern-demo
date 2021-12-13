package com.example.demo.adapter;

import java.util.HashMap;
import java.util.Map;

public class HttpAdapterImpl implements Adapter {

    private Http http;

    public HttpAdapterImpl(Http http) {
        this.http = http;
    }

    @Override
    public void post(Object entity) {
        Map<String, String> headers = new HashMap<>();
        headers.put("trace-id", "5d09a0a5ffd7063e5d2b2819");
        headers.put("user-id", "1000");
        http.post(headers, entity);
    }
}
