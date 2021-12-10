package com.example.demo.singleton;

public class HungrySingleton {

    private HungrySingleton() {
        System.out.println("这里是饿汉单例模式");
    }

    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return HungrySingleton.instance;
    }

}
