package com.example.demo.proxy.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdminCglibService {

    public void update() {
        log.info("更新操作！！");
    }

    public Object find() {
        log.info("查询操作！！");
        return new Object();
    }

}
