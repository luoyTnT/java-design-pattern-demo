package com.example.demo.responsibilitychain;

import lombok.Setter;

public abstract class AbstractEngineer {

    protected int difficulty;

    @Setter
    protected AbstractEngineer nextEngineer;

    public void develop(int value) {
        if (this.difficulty == DifficultyEnum.OTHER.getDifficulty()) {
            TopEngineer topEngineer = new TopEngineer();
            topEngineer.finish();
            return;
        }

        if (this.difficulty <= value) {
            this.finish();
            return;
        }

        if (this.nextEngineer != null) {
            value++;
            this.nextEngineer.develop(value);
        }
    }

    protected abstract void finish();

}
