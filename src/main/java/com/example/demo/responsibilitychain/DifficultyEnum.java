package com.example.demo.responsibilitychain;

import lombok.Getter;

@Getter
public enum DifficultyEnum {

    EASY(1, "简单"),
    MIDDLE(2, "中等"),
    DIFFICULT(3, "困难"),
    OTHER(999, "无法完成"),
    ;

    private final int difficulty;
    private final String value;

    DifficultyEnum(int difficulty, String value) {
        this.difficulty = difficulty;
        this.value = value;
    }

}
