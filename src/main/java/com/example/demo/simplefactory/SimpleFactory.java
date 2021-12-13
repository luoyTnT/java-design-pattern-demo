package com.example.demo.simplefactory;

public class SimpleFactory {

    public static Product makeProduct(Integer kind) {
        switch (kind) {
            case Const.PRODUCT_A1:
                return new ProductA1();
            case Const.PRODUCT_A2:
                return new ProductA2();
        }
        return new ProductA2();
    }

}
