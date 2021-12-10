package com.example.demo.singleton;

public class LazySingleton {

    private LazySingleton(){
        System.out.println("进入了懒汉单例模式");
    }

    private static LazySingleton instance;

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            System.out.println("创建");
            instance = new LazySingleton();
        } else {
            System.out.println("已创建");
        }
        return instance;
    }

}
