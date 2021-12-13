package com.example.demo.builder.team;

import com.example.demo.builder.TeamBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * 根据具体需求编写需要的内容
 * 假设这里需求为：
 * 1个高级开发，3个初级开发，1个项目经理
 */
public class SmallTeamBuilder implements TeamBuilder {

    private final Team team = new Team();

    @Override
    public void builderLeader() {
        SeniorEngineer seniorEngineer = new SeniorEngineer();
        team.setSeniorEngineer(seniorEngineer);
    }

    @Override
    public void builderEngineer() {
        List<JuniorEngineer> list = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            JuniorEngineer juniorEngineer = new JuniorEngineer();
            list.add(juniorEngineer);
        }
        team.setJuniorEngineer(list);
    }

    @Override
    public void builderProductManager() {
        ProductManager productManager = new ProductManager();
        ArrayList<ProductManager> productManagers = new ArrayList<>(1);
        productManagers.add(productManager);
        team.setProductManager(productManagers);
    }

    @Override
    public void run() {
        SeniorEngineer seniorEngineer = team.getSeniorEngineer();
        seniorEngineer.develop();

        List<JuniorEngineer> juniorEngineer = team.getJuniorEngineer();
        for (JuniorEngineer j : juniorEngineer) {
            j.develop();
        }

        List<ProductManager> productManager = team.getProductManager();
        for (ProductManager p : productManager) {
            p.plan();
        }
    }
}
