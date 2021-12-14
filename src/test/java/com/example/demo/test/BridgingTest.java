package com.example.demo.test;

import com.example.demo.bridging.*;
import org.junit.jupiter.api.Test;

public class BridgingTest {

    @Test
    void bridgingTest1() {
        Leader teamLeader = new TeamLeader(new JuniorEngineer());
        teamLeader.run();
        System.out.println("===================");

        teamLeader = new TeamLeader(new IntermediateEngineer());
        teamLeader.run();
        System.out.println("===================");

        teamLeader = new TeamLeader(new SeniorEngineer());
        teamLeader.run();
        System.out.println("===================");

    }

}
