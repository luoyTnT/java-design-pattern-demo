package com.example.demo.test;

import com.example.demo.composite.Composite;
import com.example.demo.composite.Leaf;
import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    void compositeTest1() {
        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Leaf leaf = new Leaf("1");
        Leaf leaf1 = new Leaf("2");
        Leaf leaf2 = new Leaf("3");

        composite.add(composite1);

        composite.add(leaf);
        composite1.add(leaf1);
        composite1.add(leaf2);

        composite.delete(composite1);

        composite.operation();
    }

}
