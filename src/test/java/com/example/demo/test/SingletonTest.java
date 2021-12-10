package com.example.demo.test;

import com.example.demo.singleton.HungrySingleton;
import com.example.demo.singleton.LazySingleton;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonTest {

    @Test
    void hungrySingletonTest() {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance1 = HungrySingleton.getInstance();
        if(instance.hashCode() == instance1.hashCode()){
            System.out.println("这是同一个单例");
        }else {
            System.out.println("执行了单例模式");
        }

        for (int i = 0; i < 5; i++) {
            HungrySingleton instance2 = HungrySingleton.getInstance();
            System.out.println(instance2.hashCode());
        }
    }

    @Test
    void LazySingletonTest() {
        //模拟多线程
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(LazySingleton::getInstance);
        }
        executorService.shutdown();
    }

}
