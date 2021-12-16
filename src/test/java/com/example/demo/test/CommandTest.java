package com.example.demo.test;

import com.example.demo.command.ConcreteCommand;
import com.example.demo.command.Invoker;
import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    void commandTest1(){
        ConcreteCommand concreteCommand = new ConcreteCommand();
        Invoker invoker = new Invoker(concreteCommand);
        invoker.call();
    }

}
