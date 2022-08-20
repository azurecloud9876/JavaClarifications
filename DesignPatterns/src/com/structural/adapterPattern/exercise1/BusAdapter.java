package com.structural.adapterPattern.exercise1;

public class BusAdapter extends Bus implements Vehicle {
    @Override
    public void accelerate() {
        this.movement();
    }

    @Override
    public void pushBreak() {
        this.stopped();

    }

    @Override
    public void soundHorn() {
        this.Horn();
    }
}
