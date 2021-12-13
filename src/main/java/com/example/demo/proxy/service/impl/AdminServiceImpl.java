package com.example.demo.proxy.service.impl;

import com.example.demo.proxy.service.AdminService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdminServiceImpl implements AdminService {

    @Override
    public void update() {
        log.info("更新操作！！");
    }

    @Override
    public Object find() {
        log.info("查询操作！！");
        return new Object();
    }

}
