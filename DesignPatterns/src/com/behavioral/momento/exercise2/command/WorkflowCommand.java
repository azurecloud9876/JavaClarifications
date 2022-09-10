package com.behavioral.momento.exercise2.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
