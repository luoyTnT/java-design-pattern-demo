package com.example.demo.strategy;

import lombok.Data;

@Data
public class Content {

    private Strategy strategy;

    public void strategyMethod() {
        strategy.strategyMethod();
    }

}
