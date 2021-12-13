package com.example.demo.test;

import com.example.demo.abstractfactory.factory.AbstractFactory;
import com.example.demo.abstractfactory.factory.IntermediateFactory;
import com.example.demo.abstractfactory.factory.JuniorFactory;
import com.example.demo.abstractfactory.factory.SeniorFactory;
import com.example.demo.abstractfactory.manager.ProductManager;
import com.example.demo.abstractfactory.staff.Staff;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    void AbstractFactoryTest1() {
        AbstractFactory juniorFactory = new JuniorFactory();
        this.factory(juniorFactory);

        System.out.println("==========================");

        AbstractFactory intermediateFactory = new IntermediateFactory();
        this.factory(intermediateFactory);

        System.out.println("==========================");

        AbstractFactory seniorFactory = new SeniorFactory();
        this.factory(seniorFactory);
    }

    private void factory(AbstractFactory abstractFactory) {
        Staff staff = abstractFactory.getStaff();
        staff.develop();
        ProductManager productManager = abstractFactory.getProductManager();
        productManager.plan();
    }

}
