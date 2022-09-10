package com.behavioral.interpreter.exercise2;

public class Main {
    public static void main(String[] args) {
        Expression[] expressions = new Expression[]{
                new RomanOneExpression()
        };
        RomanNumerals romanNumerals = new RomanNumerals(7);
        for (Expression e :
                expressions) {

            e.Interpreter(romanNumerals);
        }
        System.out.println("the results ==  " + romanNumerals.Output);

    }
}
