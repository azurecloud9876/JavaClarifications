package com.creational.abstractfactory.exercise1;

//Represents an abstract product
public interface Instance {
    void start();

    void attachStorage(Storage storage);

    void stop();

    enum Capacity {micro, small, large}
}
