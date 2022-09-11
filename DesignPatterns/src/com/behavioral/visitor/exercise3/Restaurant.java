package com.behavioral.visitor.exercise3;

public class Restaurant extends Client {

    private final boolean branchesInsured;

    public Restaurant(String name, String address, String number, boolean branchesInsured) {
        super(name, address, number);
        this.branchesInsured = branchesInsured;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
