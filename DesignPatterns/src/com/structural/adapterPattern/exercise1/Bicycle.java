package com.structural.adapterPattern.exercise1;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */

//Adaptee
public class Bicycle {

    public void pedal() {
        System.out.println("Bic starts to move");
    }

    public void stop() {
        System.out.println("Bic stopped");
    }

    public void ringBell() {
        System.out.println("Ring ring");
    }
}
