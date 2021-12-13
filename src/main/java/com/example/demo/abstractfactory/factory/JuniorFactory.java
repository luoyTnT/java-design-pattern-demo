package com.example.demo.abstractfactory.factory;

import com.example.demo.abstractfactory.manager.JuniorManager;
import com.example.demo.abstractfactory.manager.ProductManager;
import com.example.demo.abstractfactory.staff.JuniorStaff;
import com.example.demo.abstractfactory.staff.Staff;

public class JuniorFactory implements AbstractFactory {
    @Override
    public Staff getStaff() {
        return new JuniorStaff();
    }

    @Override
    public ProductManager getProductManager() {
        return new JuniorManager();
    }
}
