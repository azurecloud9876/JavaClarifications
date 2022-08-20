package com.structural.adapterPattern.exercise1;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */

//Client
public class Client {

    public static void main(String[] args) {
        Vehicle car = new Car();
        playWithVehicle(car);

        //Object Adapter - This form uses Java Composition and adapter contains the source object.
        Vehicle bicycle = new BicycleAdapter(new Bicycle());
        playWithVehicle(bicycle);

        //Class Adapter - This form uses java inheritance and extends the source interface, in our case Socket class.
        Vehicle bus = new BusAdapter();
        playWithVehicle(bus);
    }

    private static void playWithVehicle(Vehicle vehicle) {

        vehicle.accelerate();
        vehicle.pushBreak();
        vehicle.soundHorn();
        System.out.println("\n");
    }
}
