package com.example.demo.test;

import com.example.demo.memento.Caretaker;
import com.example.demo.memento.Originator;
import org.junit.jupiter.api.Test;

public class MementoTest {

    @Test
    void mementoTest1() {
        Originator or = new Originator();
        Caretaker cr = new Caretaker();
        or.setState("S0");
        System.out.println("初始状态:" + or.getState());
        cr.setMemento(or.createMemento()); //保存状态
        or.setState("S1");
        System.out.println("新的状态:" + or.getState());
        or.restoreMemento(cr.getMemento()); //恢复状态
        System.out.println("恢复状态:" + or.getState());
    }

}
