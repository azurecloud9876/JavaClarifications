package com.behavioral.interpreter.exercise2;

public class RomanOneExpression extends Expression {

    @Override
    void Interpreter(RomanNumerals baseTenNumber) {
        while ((baseTenNumber.Input - 9) >= 0) {
            baseTenNumber.Output += "IX";
            baseTenNumber.Input -= 9;

        }
        while ((baseTenNumber.Input - 5) >= 0) {
            baseTenNumber.Output += "v";
            baseTenNumber.Input -= 5;


        }
        while ((baseTenNumber.Input - 4) >= 0) {
            baseTenNumber.Output += "IV";
            baseTenNumber.Input -= 4;

        }
        while ((baseTenNumber.Input - 3) >= 0) {
            baseTenNumber.Output += "III";
            baseTenNumber.Input -= 3;

        }
        while ((baseTenNumber.Input - 2) >= 0) {
            baseTenNumber.Output += "II";
            baseTenNumber.Input -= 2;
        }
        while ((baseTenNumber.Input - 1) >= 0) {
            baseTenNumber.Output += "I";
            baseTenNumber.Input -= 1;


        }
    }
}
