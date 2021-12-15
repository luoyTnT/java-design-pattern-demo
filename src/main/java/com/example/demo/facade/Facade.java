package com.example.demo.facade;

public class Facade {

    private EngineerOne engineerOne = new EngineerOne();
    private EngineerTwo engineerTwo = new EngineerTwo();
    private EngineerThree engineerThree = new EngineerThree();

    public void method(){
        this.engineerOne.develop();
        this.engineerTwo.develop();
        this.engineerThree.develop();
    }
}
