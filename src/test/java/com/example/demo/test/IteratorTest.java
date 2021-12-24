package com.example.demo.test;

import com.example.demo.iterator.Aggregate;
import com.example.demo.iterator.ConcreteAggregate;
import com.example.demo.iterator.Iterator;
import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    void iteratorTest1() {
        Aggregate ag = new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("华南理工");
        ag.add("韶关学院");
        System.out.print("聚合的内容有：");
        Iterator it = ag.getIterator();
        while (it.hasNext()) {
            Object ob = it.next();
            System.out.print(ob.toString() + "\t");
        }
        Object ob = it.first();
        System.out.println("\nFirst：" + ob.toString());
    }

}
