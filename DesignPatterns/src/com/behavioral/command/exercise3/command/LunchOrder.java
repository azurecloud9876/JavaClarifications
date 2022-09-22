package com.behavioral.command.exercise3.command;

import com.behavioral.command.exercise3.Command;
import com.behavioral.command.exercise3.receiver.Chef;

public class LunchOrder implements Command {
    private final Chef chef;

    public LunchOrder(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.prepareLunch();
    }
}
