package com.example.demo.test;

import com.example.demo.factory.ConcreteFactory1;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    void FactoryTest01() {
        new ConcreteFactory1().newProduct().show();
    }

}
