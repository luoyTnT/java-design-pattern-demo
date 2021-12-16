package com.example.demo.strategy;

public class StrategyClass1 implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略1调用");
    }
}
