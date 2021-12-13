package com.example.demo.builder.team;

import lombok.Data;

import java.util.List;

@Data
public class Team {

    private SeniorEngineer seniorEngineer;

    private List<JuniorEngineer> juniorEngineer;

    private List<ProductManager> productManager;

}
