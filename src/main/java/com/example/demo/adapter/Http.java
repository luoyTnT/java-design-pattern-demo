package com.example.demo.adapter;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.Map;

/**
 * 模拟一个http请求时调用设置的模型适配器
 */
@Data
public class Http {

    private String url;
    private String mediaType;

    public void post(Map<String, String> headers, Object entity) {
        System.out.println("post:" + url
                + ";\nheaders:" + JSON.toJSONString(headers)
                + ";\nentity:" + JSON.toJSONString(entity)
                + ";\nmediaType:" + mediaType);
    }

}
