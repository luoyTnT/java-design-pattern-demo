package com.example.demo.test;

import com.example.demo.mediator.*;
import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    void mediatorTest1() {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }

}
