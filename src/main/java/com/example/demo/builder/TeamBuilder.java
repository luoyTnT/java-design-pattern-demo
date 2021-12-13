package com.example.demo.builder;

/**
 * 团队构建者
 * 构建需要的模块，或者说部件
 */
public interface TeamBuilder {

    void builderLeader();

    void builderEngineer();

    void builderProductManager();

    void run();

}
