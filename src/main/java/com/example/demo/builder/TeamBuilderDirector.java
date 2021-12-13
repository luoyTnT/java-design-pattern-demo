package com.example.demo.builder;

/**
 * 团队指挥者
 * 通过指挥者为入口调用其他功能
 */
public class TeamBuilderDirector {

    public void construct(TeamBuilder teamBuilder){
        teamBuilder.builderLeader();
        teamBuilder.builderEngineer();
        teamBuilder.builderProductManager();
    }

}
