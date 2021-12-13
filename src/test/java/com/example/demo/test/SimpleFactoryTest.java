package com.example.demo.test;

import com.example.demo.simplefactory.Const;
import com.example.demo.simplefactory.SimpleFactory;
import org.junit.jupiter.api.Test;

public class SimpleFactoryTest {

    @Test
    void simpleFactoryTest01() {
        SimpleFactory.makeProduct(Const.PRODUCT_A1).show();
    }

}
