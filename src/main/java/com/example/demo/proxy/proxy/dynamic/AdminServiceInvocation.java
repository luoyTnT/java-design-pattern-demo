package com.example.demo.proxy.proxy.dynamic;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理
 */
@Slf4j
public class AdminServiceInvocation implements InvocationHandler {

    private final Object target;

    public AdminServiceInvocation(Object target) {
        this.target = target;
    }

    /**
     * 该方法负责集中处理动态代理类上的所有方法调用，
     * 第一个参数是代理类实例，
     * 第二个参数是被调用的方法对象，
     * 第三个方法是调用参数。
     * 调用处理器根据这三个参数进行处理或分派到委托类实例上执行
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("判断用户是否有权限进行操作");
        Object obj = method.invoke(target);
        log.info("记录用户操作日志");
        return obj;
    }
}
