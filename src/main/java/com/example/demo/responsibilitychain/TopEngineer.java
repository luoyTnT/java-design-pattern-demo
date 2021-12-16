package com.example.demo.responsibilitychain;

public class TopEngineer extends AbstractEngineer {

    @Override
    protected void finish() {
        System.out.println("任务无法完成，已驳回");
    }
}
