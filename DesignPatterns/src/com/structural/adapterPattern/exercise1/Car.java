package com.structural.adapterPattern.exercise1;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Car starts to move");
    }

    @Override
    public void pushBreak() {
        System.out.println("Car Stopped");
    }

    @Override
    public void soundHorn() {
        System.out.println("Beeb Beep");
    }
}
