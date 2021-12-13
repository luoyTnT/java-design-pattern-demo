package com.example.demo.abstractfactory.factory;

import com.example.demo.abstractfactory.manager.ProductManager;
import com.example.demo.abstractfactory.staff.Staff;

public interface AbstractFactory {

    Staff getStaff();

    ProductManager getProductManager();

}
