package com.example.demo.test;

import com.example.demo.visitor.*;
import org.junit.jupiter.api.Test;

public class VisitorTest {

    @Test
    void visitorTest1() {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor = new ConcreteVisitorB();
        os.accept(visitor);
    }

}
