package com.example.demo.test;

import com.example.demo.responsibilitychain.DifficultyEnum;
import com.example.demo.responsibilitychain.IntermediateEngineer;
import com.example.demo.responsibilitychain.JuniorEngineer;
import com.example.demo.responsibilitychain.SeniorEngineer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ResponsibilityChainTest {

    @Test
    void responsibilityChainTest1() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
            list.add(DifficultyEnum.OTHER.getDifficulty());
            list.add(DifficultyEnum.DIFFICULT.getDifficulty());
            for (int j = 0; j < 2; j++) {
                list.add(DifficultyEnum.EASY.getDifficulty());
                list.add(DifficultyEnum.MIDDLE.getDifficulty());
            }
        }

        System.out.println(list);

        for (Integer difficulty : list) {
            this.engineer(difficulty);
        }

    }

    private void engineer(int difficulty) {
        JuniorEngineer juniorEngineer = new JuniorEngineer(difficulty);
        IntermediateEngineer intermediateEngineer = new IntermediateEngineer(difficulty);
        SeniorEngineer seniorEngineer = new SeniorEngineer(difficulty);

        juniorEngineer.setNextEngineer(intermediateEngineer);
        intermediateEngineer.setNextEngineer(seniorEngineer);

        juniorEngineer.develop(DifficultyEnum.EASY.getDifficulty());
    }

}
