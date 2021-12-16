package com.example.demo.command;

public class ConcreteCommand implements Command {

    private final Receiver receiver;

    public ConcreteCommand() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
