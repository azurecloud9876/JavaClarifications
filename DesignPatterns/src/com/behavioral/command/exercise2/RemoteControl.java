package com.behavioral.command.exercise2;

import java.util.LinkedList;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */

//Invoker
public class RemoteControl {

    private final Command[] onCommands;
    private final Command[] offCommands;

    private final LinkedList<Command> history;

    private final int SLOTS = 5;

    public RemoteControl() {
        onCommands = new Command[SLOTS];
        offCommands = new Command[SLOTS];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < SLOTS; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        history = new LinkedList<>();
    }


    protected void addCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
        history.push(onCommands[slot]);
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
        history.push(offCommands[slot]);
    }

    public void undoButtonPressed() {
        if (history.peek() != null) {
            history.poll().undo();
        } else {
            System.out.println("No more history");
        }
    }

    @Override
    public String toString() {
        System.out.println("---------- Remote Control ----------");
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < SLOTS; i++) {
            buffer.append(String.format("[Slot %d] %s \t %s%n", i, onCommands[i].getClass().getSimpleName(), offCommands[i].getClass().getSimpleName()));
        }

        return buffer.toString();
    }
}
