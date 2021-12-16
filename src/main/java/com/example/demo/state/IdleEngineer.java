package com.example.demo.state;

public class IdleEngineer extends Status {

    public IdleEngineer(String status) {
        this.status = status;
    }

    @Override
    public void exe(EngineerContext engineerContext) {
        System.out.println("工程师闲置中，请分布任务");
        engineerContext.setStatus(this);
    }
}