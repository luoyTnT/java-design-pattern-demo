package com.example.demo.test;

import com.example.demo.prototype.Engineer;
import com.example.demo.prototype.EngineerImpl;
import com.example.demo.prototype.Prototype;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @Test
    void prototypeTest() throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        Prototype clone = (Prototype) prototype.clone();
        System.out.println("原型与克隆内存地址是否相同: " + (prototype == clone));
    }

    @Test
    void engineerTest() {
        Engineer engineer = new EngineerImpl();
        engineer.setDuty("工程师");
        engineer.setEngineerName("张三（初级）");
        engineer.develop("easy program");

        System.out.println("\n=============================\n");

        Engineer clone = (EngineerImpl) engineer.clone();
        clone.setEngineerName("李四（高级）");
        clone.develop("difficult program");
    }

}
