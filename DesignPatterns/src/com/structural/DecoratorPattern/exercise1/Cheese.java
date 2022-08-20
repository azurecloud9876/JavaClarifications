package com.structural.DecoratorPattern.exercise1;

public class Cheese extends SandwichDecorator {

    Cheese(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getItemName() {
        return super.getItemName() + " Cheese Added";
    }
}
