package com.example.demo.test;

import com.example.demo.builder.TeamBuilder;
import com.example.demo.builder.TeamBuilderDirector;
import com.example.demo.builder.team.SmallTeamBuilder;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    void builderTest1() {
        TeamBuilderDirector teamBuilderDirector = new TeamBuilderDirector();
        TeamBuilder smallTeamBuilder = new SmallTeamBuilder();
        teamBuilderDirector.construct(smallTeamBuilder);
        smallTeamBuilder.run();
    }

}
