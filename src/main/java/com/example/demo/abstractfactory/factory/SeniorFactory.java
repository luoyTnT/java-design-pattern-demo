package com.example.demo.abstractfactory.factory;

import com.example.demo.abstractfactory.manager.ProductManager;
import com.example.demo.abstractfactory.manager.SeniorManager;
import com.example.demo.abstractfactory.staff.SeniorStaff;
import com.example.demo.abstractfactory.staff.Staff;

public class SeniorFactory implements AbstractFactory {
    @Override
    public Staff getStaff() {
        return new SeniorStaff();
    }

    @Override
    public ProductManager getProductManager() {
        return new SeniorManager();
    }
}
