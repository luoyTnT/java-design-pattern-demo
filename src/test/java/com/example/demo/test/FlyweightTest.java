package com.example.demo.test;

import com.example.demo.flyweight.Engineer;
import com.example.demo.flyweight.Flyweight;
import org.junit.jupiter.api.Test;

public class FlyweightTest {

    @Test
    void flyweightTest1() {
        Engineer junior = Flyweight.getEngineer(Engineer.EASY);
        junior.develop();

        Engineer intermediate = Flyweight.getEngineer(Engineer.MEDIUM);
        intermediate.develop();

        Engineer senior = Flyweight.getEngineer(Engineer.DIFFICULT);
        senior.develop();

        Engineer junior2 = Flyweight.getEngineer(Engineer.EASY);

        Engineer junior3 = Flyweight.getEngineer(-1);
        junior3.develop();

        if(junior == junior2){
            System.out.println("相等");
            System.out.println(junior.hashCode() + "=" +junior2.hashCode());
        }

    }

}
