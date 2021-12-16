package com.example.demo.test;

import com.example.demo.strategy.Content;
import com.example.demo.strategy.StrategyClass1;
import com.example.demo.strategy.StrategyClass2;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    void strategyTest1(){
        Content content = new Content();
        content.setStrategy(new StrategyClass1());
        content.strategyMethod();

        System.out.println("================");

        content.setStrategy(new StrategyClass2());
        content.strategyMethod();
    }

}
