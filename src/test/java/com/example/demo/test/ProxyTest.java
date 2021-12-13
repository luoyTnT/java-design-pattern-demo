package com.example.demo.test;

import com.example.demo.proxy.proxy.cglib.AdminServiceCglibProxy;
import com.example.demo.proxy.proxy.dynamic.AdminServiceDynamicProxy;
import com.example.demo.proxy.proxy.dynamic.AdminServiceInvocation;
import com.example.demo.proxy.proxy.statics.AdminServiceProxy;
import com.example.demo.proxy.service.AdminCglibService;
import com.example.demo.proxy.service.AdminService;
import com.example.demo.proxy.service.impl.AdminServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

@Slf4j
public class ProxyTest {

    /**
     * 静态代理
     */
    @Test
    public void proxyStaticTest() {
        AdminServiceImpl adminService = new AdminServiceImpl();
        AdminServiceProxy proxy = new AdminServiceProxy(adminService);
        proxy.update();
        log.info("==========================");
        proxy.find();
    }

    /**
     * JDK动态代理
     */
    @Test
    public void dynamicProxyTest() {
        AdminServiceImpl adminService = new AdminServiceImpl();
        log.info("代理目标对象: {}", adminService.getClass());

        AdminServiceInvocation invocation = new AdminServiceInvocation(adminService);

        this.methodOneTest(adminService, invocation);

        this.methodTwoTest(adminService, invocation);

        this.methodThreeTest(adminService);
    }

    private void methodOneTest(AdminServiceImpl adminService, AdminServiceInvocation invocation) {
        log.info("\n\n=============方法1=============");

        Object dynamicProxy = new AdminServiceDynamicProxy(adminService, invocation).getPersonProxy();

        this.adminServiceCall(dynamicProxy);
    }

    private void methodTwoTest(AdminServiceImpl adminService, AdminServiceInvocation invocation) {
        log.info("\n\n=============方法2=============");

        ClassLoader classLoader = adminService.getClass().getClassLoader();
        Class<?>[] interfaces = adminService.getClass().getInterfaces();
        Object dynamicProxy = Proxy.newProxyInstance(classLoader, interfaces, invocation);

        this.adminServiceCall(dynamicProxy);
    }

    private void methodThreeTest(AdminServiceImpl adminService) {
        log.info("\n\n=============方法3=============");

        ClassLoader classLoader = adminService.getClass().getClassLoader();
        Class<?>[] interfaces = adminService.getClass().getInterfaces();
        Object dynamicProxy = Proxy.newProxyInstance(classLoader, interfaces, (proxy, method, args) -> {
            log.info("判断用户是否有权限进行操作");
            Object obj = method.invoke(adminService, args);
            log.info("记录用户操作日志");
            return obj;
        });

        this.adminServiceCall(dynamicProxy);
    }

    private void adminServiceCall(Object dynamicProxy) {
        AdminService proxy = (AdminService) dynamicProxy;

        log.info("代理对象: {}", proxy.getClass());
        Object obj = proxy.find();
        log.info("find 返回对象: {}", obj.getClass());
        log.info("--------------------------------");
        proxy.update();
    }

    /**
     * cglib动态代理
     */
    @Test
    void cglibProxyTest01() {
        AdminCglibService adminCglibService = new AdminCglibService();
        AdminServiceCglibProxy cglibProxy = new AdminServiceCglibProxy(adminCglibService);
        AdminCglibService proxy = (AdminCglibService) cglibProxy.getProxyInstance();

        this.adminServiceCall(proxy);
    }

    private void adminServiceCall(AdminCglibService proxy) {
        log.info("代理对象: {}", proxy.getClass());
        Object obj = proxy.find();
        log.info("find 返回对象: {}", obj.getClass());
        log.info("--------------------------------");
        proxy.update();
    }


}
