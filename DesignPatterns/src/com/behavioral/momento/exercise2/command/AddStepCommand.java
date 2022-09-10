package com.behavioral.momento.exercise2.command;


import com.behavioral.momento.exercise2.WorkflowDesigner;

public class AddStepCommand extends AbstractWorkflowCommand {

    private final String step;

    public AddStepCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();

        receiver.addStep(step);
    }
}
