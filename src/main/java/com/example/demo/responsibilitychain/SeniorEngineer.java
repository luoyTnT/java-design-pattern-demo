package com.example.demo.responsibilitychain;

public class SeniorEngineer extends AbstractEngineer {

    public SeniorEngineer(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    protected void finish() {
        System.out.println("高级工程师完成了任务");
    }
}
