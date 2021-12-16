package com.example.demo.state;

public class BusyEngineer extends Status {

    public BusyEngineer(String status){
        this.status = status;
    }

    @Override
    public void exe(EngineerContext engineerContext) {
        System.out.println("工程师正在忙碌中，请稍后");
        engineerContext.setStatus(this);
    }
}
