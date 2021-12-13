package com.example.demo.proxy.proxy.statics;

import com.example.demo.proxy.service.AdminService;
import lombok.extern.slf4j.Slf4j;

/**
 * java静态代理
 * <p>
 * 静态代理模式在不改变目标对象的前提下，
 * 实现了对目标对象的功能扩展。
 * 不足：静态代理实现了目标对象的所有方法，
 * 一旦目标接口增加方法，
 * 代理对象和目标对象都要进行相应的修改，增加维护成本。
 */
@Slf4j
public class AdminServiceProxy implements AdminService {

    private final AdminService adminService;

    public AdminServiceProxy(AdminService adminService) {
        this.adminService = adminService;
    }

    @Override
    public void update() {
        log.info("进入代理，判断更新操作权限！！");
        adminService.update();
        log.info("记录用户更新操作日志！！");
    }

    @Override
    public Object find() {
        log.info("进入代理，判断查询操作权限！！");
        log.info("记录用户查询操作日志！！");
        return adminService.find();
    }
}
