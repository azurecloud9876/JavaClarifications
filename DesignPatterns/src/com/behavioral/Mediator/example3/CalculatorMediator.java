package com.behavioral.Mediator.example3;

import java.util.HashSet;

public class CalculatorMediator {

    HashSet<Operation> operations = new HashSet<>();
    double previousResult = 0;


    public void notifyMediator(Operation operation) {
        this.previousResult = operation.getResult();
    }
}
