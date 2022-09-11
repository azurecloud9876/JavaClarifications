package com.behavioral.visitor.exercise3;

import java.util.List;

public class SMSVisitor implements Visitor {

    public void send(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    @Override
    public void visit(Bank bank) {
        System.out.println("SMS sent to Bank");
    }

    @Override
    public void visit(Restaurant restaurant) {
        System.out.println("SMS sent to Restaurant");
    }
}
