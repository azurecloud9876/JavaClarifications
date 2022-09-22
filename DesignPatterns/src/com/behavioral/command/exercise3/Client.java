package com.behavioral.command.exercise3;

import com.behavioral.command.exercise3.command.DinnerOrder;
import com.behavioral.command.exercise3.command.LunchOrder;
import com.behavioral.command.exercise3.invoker.Waiter;
import com.behavioral.command.exercise3.receiver.Chef;

/*
 * https://rahman-sameeha.medium.com/commanding-attention-the-design-pattern
 * https://www.linkedin.com/pulse/command-design-pattern-java-saral-saxena
 * http://www.codenuclear.com/command-design-pattern-java/
 * */
public class Client {

    public static void main(String[] args) {
        //Receiver
        var chef = new Chef();
        //Command
        var lunchCommand = new LunchOrder(chef);
        var dinnerCommand = new DinnerOrder(chef);
        //Invoker
        var order = new Waiter();
        order.placeOrder(lunchCommand);
        order.placeOrder(dinnerCommand);
    }
}
