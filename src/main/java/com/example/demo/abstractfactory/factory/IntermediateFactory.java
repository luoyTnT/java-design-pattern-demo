package com.example.demo.abstractfactory.factory;

import com.example.demo.abstractfactory.manager.IntermediateManager;
import com.example.demo.abstractfactory.manager.ProductManager;
import com.example.demo.abstractfactory.staff.IntermediateStaff;
import com.example.demo.abstractfactory.staff.Staff;

public class IntermediateFactory implements AbstractFactory {
    @Override
    public Staff getStaff() {
        return new IntermediateStaff();
    }

    @Override
    public ProductManager getProductManager() {
        return new IntermediateManager();
    }
}
