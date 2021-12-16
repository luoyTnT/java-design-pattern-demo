package com.example.demo.test;

import com.example.demo.state.*;
import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    void stateTest1() {
        EngineerContext engineerContext = new EngineerContext();
        Status status = new IdleEngineer(StateEnum.IDLE.getMsg());
        status.exe(engineerContext);
        System.out.println(engineerContext.getStatus().getStatus());

        System.out.println("====================");

        status = new BusyEngineer(StateEnum.BUSY.getMsg());
        status.exe(engineerContext);
        System.out.println(engineerContext.getStatus().getStatus());
    }

}
