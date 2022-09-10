package com.behavioral.command.exercise2;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class TurnOnTVCommand implements Command {

    private final TV tv;

    public TurnOnTVCommand(TV light) {
        this.tv = light;
    }

    @Override
    public void execute() {
        this.tv.turnOn();
    }

    @Override
    public void undo() {
        this.tv.turnOff();
    }
}
