package com.example.demo.test;

import com.example.demo.adapter.Http;
import com.example.demo.adapter.HttpAdapterImpl;
import com.example.demo.adapter.twowayadapter.RequestRealize;
import com.example.demo.adapter.twowayadapter.TargetRealize;
import com.example.demo.adapter.twowayadapter.TwoWayAdapter;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class AdapterTest {

    @Test
    void adapterTest1() {
        Http http = new Http();
        http.setUrl("http://www.baidu.com");
        http.setMediaType("application/json");

        HttpAdapterImpl httpAdapter = new HttpAdapterImpl(http);

        Map<String, String> map = new HashMap<>();
        map.put("id", "123131231");
        map.put("name", "张三");

        httpAdapter.post(map);
    }

    /**
     * 双向适配器
     */
    @Test
    void adapterTest2() {
        System.out.println("目标通过双向适配器访问适配者：");
        RequestRealize requestRealize = new RequestRealize();
        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(requestRealize);
        twoWayAdapter.request();
        System.out.println("======================");
        System.out.println("适配者通过双向适配器访问目标：");
        TargetRealize targetRealize = new TargetRealize();
        TwoWayAdapter twoWayAdapter1 = new TwoWayAdapter(targetRealize);
        twoWayAdapter1.twoWayRequest();
    }

}
