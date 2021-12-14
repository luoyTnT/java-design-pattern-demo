package com.example.demo.bridging;

public class TeamLeader extends Leader {

    public TeamLeader(Engineer engineer) {
        super(engineer);
    }

    @Override
    public void run() {
        engineer.develop();
    }

}
