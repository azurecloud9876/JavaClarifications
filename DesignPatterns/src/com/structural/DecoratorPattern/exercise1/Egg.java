package com.structural.DecoratorPattern.exercise1;

public class Egg extends SandwichDecorator {

    Egg(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public int getCost() {
        return super.getCost() + 6;
    }

    @Override
    public String getItemName() {
        return super.getItemName() + " Added Egg";
    }
}
