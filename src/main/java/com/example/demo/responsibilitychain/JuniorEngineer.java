package com.example.demo.responsibilitychain;

public class JuniorEngineer extends AbstractEngineer {

    public JuniorEngineer(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    protected void finish() {
        System.out.println("初级工程师完成了任务");
    }
}
