package com.example.demo.test;

import com.example.demo.interpreter.Context;
import org.junit.jupiter.api.Test;

public class InterpreterTest {

    @Test
    void InterpreterTest1() {
        Context bus = new Context();
        bus.freeRide("韶关的老人");
        bus.freeRide("韶关的年轻人");
        bus.freeRide("广州的妇女");
        bus.freeRide("广州的儿童");
        bus.freeRide("山东的儿童");
    }

}
