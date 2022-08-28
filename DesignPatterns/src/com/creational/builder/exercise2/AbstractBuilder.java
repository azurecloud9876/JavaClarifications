package com.creational.builder.exercise2;

public abstract class AbstractBuilder<T, B> {

    public T availableBean;


    public T build() {
        return availableBean;
    }
}
