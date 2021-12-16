package com.example.demo.responsibilitychain;

public class IntermediateEngineer extends AbstractEngineer {

    public IntermediateEngineer(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    protected void finish() {
        System.out.println("中级工程师完成了任务");
    }
}
