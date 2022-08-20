package com.structural.DecoratorPattern.exercise1;

public abstract class SandwichDecorator implements Sandwich {

    private Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public int getCost() {
        return this.sandwich.getCost();
    }

    @Override
    public String getItemName() {
        return this.sandwich.getItemName();
    }
}
