package com.example.demo.singleton;

public class StaticSingleton {

    private StaticSingleton() {
    }

    private static class InnerSingleton {
        private static final StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return InnerSingleton.instance;
    }

}
