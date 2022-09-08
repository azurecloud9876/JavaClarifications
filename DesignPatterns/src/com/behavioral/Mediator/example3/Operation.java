package com.behavioral.Mediator.example3;

public abstract class Operation {

    private final String operationName;
    private final CalculatorMediator calculatorMediator;
    private double result;


    Operation(String operationName, CalculatorMediator calculatorMediator) {
        this.operationName = operationName;
        this.calculatorMediator = calculatorMediator;
    }

    public double getResult() {
        return result;
    }

    public void performOperation(double operand) {
        result = performOperation(calculatorMediator.previousResult, operand);
        calculatorMediator.notifyMediator(this);
    }

    abstract double performOperation(double operand1, double operand2);
}
