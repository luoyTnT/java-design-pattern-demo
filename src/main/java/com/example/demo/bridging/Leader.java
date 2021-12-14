package com.example.demo.bridging;

public abstract class Leader {

    protected Engineer engineer;

    public Leader(Engineer engineer) {
        this.engineer = engineer;
    }

    public abstract void run();

}
