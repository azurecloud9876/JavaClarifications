package com.behavioral.command.exercise3.invoker;

import com.behavioral.command.exercise3.Command;

public class Waiter {

    public void placeOrder(Command command) {
        command.execute();
    }
}
