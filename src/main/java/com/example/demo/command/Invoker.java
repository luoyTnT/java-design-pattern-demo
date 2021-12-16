package com.example.demo.command;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * 调用者
 */
@AllArgsConstructor
@Setter
public class Invoker {

    private final Command command;

    public void call() {
        System.out.println("调用者执行命令command");
        this.command.execute();
    }
}
