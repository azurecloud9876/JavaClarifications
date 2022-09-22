package com.behavioral.command.exercise3.command;

import com.behavioral.command.exercise3.Command;
import com.behavioral.command.exercise3.receiver.Chef;

public class DinnerOrder implements Command {

    private final Chef chef;

    public DinnerOrder(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.prepareDinner();
    }
}
