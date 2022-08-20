package com.structural.FacadePattern.exercise1;

public class Main {
    public static void main(String[] args) {
        Subsystem1 subsystem1=new Subsystem1();
        Subsystem2 subsystem2=new Subsystem2();
        Facade facade = new Facade(subsystem1,subsystem2);
        Client.ClientCode(facade);

    }
}
