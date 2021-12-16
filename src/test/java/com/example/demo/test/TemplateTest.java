package com.example.demo.test;

import com.example.demo.template.Concrete;
import com.example.demo.template.Concrete2;
import org.junit.jupiter.api.Test;

public class TemplateTest {

    @Test
    void templateTest1(){
        Concrete concrete = new Concrete();
        concrete.templateMethod();

        Concrete2 concrete2 = new Concrete2();
        concrete2.templateMethod();
    }

}
