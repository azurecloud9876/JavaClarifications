package com.behavioral.Mediator.example3;

public class Main {

    public static void main(String[] args) {

        CalculatorMediator calculatorMediator = new CalculatorMediator();
        Operation add = new Operation("Add", calculatorMediator) {
            double performOperation(double operand1, double operand2) {
                return operand1 + operand2;
            }
        };

        Operation sub = new Operation("Sub", calculatorMediator) {
            double performOperation(double operand1, double operand2) {
                return operand1 - operand2;
            }
        };

        Operation mul = new Operation("Mul", calculatorMediator) {
            double performOperation(double operand1, double operand2) {
                return operand1 * operand2;
            }
        };

        // 1 + 30  = 31
        add.performOperation(1);
        add.performOperation(30);

        // previous result - 3 = 28
        sub.performOperation(3);

        // previous result * 3 = 84
        mul.performOperation(3);

        System.out.println("Answer is : " + calculatorMediator.previousResult);
    }
}
