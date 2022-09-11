package com.behavioral.visitor.exercise3;

import java.util.List;

public class EmailVisitor implements Visitor {

    public void send(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    @Override
    public void visit(Bank bank) {
        System.out.println("Email sent to Bank");
    }

    @Override
    public void visit(Restaurant restaurant) {
        System.out.println("Email sent to Restaurant");
    }
}
