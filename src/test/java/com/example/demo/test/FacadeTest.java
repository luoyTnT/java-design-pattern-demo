package com.example.demo.test;

import com.example.demo.facade.Facade;
import org.junit.jupiter.api.Test;

public class FacadeTest {

    @Test
    void facadeTest1() {
        Facade facade = new Facade();
        facade.method();
    }

}
