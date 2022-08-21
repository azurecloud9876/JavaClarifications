package com.test.two;

/*
 Java allows methods to be overridden, but not variables. Therefore, marking them final does not prevent them from
being reimplemented in a subclass. Furthermore, polymorphism does not apply in the same way it would to methods as it
 does to variables. In particular, the reference type determines the version of the secret variable that is selected
 @Output
    InfiniteMath: 2.0
    InfiniteMath static string using class name: Math
    InfiniteMath static string using obj reference: Math
    ------------------------------------------------------
    ComplexMath: 2.0
    ComplexMath static string using class name: Math
    ComplexMath static string using obj reference: Math
    ---------------------------------------------------------------
    ComplexMath: 4.0
    ComplexMath static string using obj reference: ComplexMath
    --------------------------------------------------------------
    Math: 2.0
    Math static string using class name: Math
    Math static string using obj reference: Math

*/
public class Client {

    public static void main(String[] args) {
        Math infiniteMat = new InfiniteMath();
        System.out.println("InfiniteMath: " + infiniteMat.secret);
        System.out.println("InfiniteMath static string using class name: " + Math.CLASS_NAME);
        System.out.println("InfiniteMath static string using obj reference: " + Math.CLASS_NAME);

        Math complexMat = new ComplexMath();
        System.out.println("ComplexMath: " + complexMat.secret);
        System.out.println("ComplexMath static string using class name: " + Math.CLASS_NAME);
        System.out.println("ComplexMath static string using obj reference: " + Math.CLASS_NAME);

        ComplexMath complexMat1 = new ComplexMath();
        System.out.println("ComplexMath: " + complexMat1.secret);
        System.out.println("ComplexMath static string using obj reference: " + ComplexMath.CLASS_NAME);

        Math mat = new Math();
        System.out.println("Math: " + mat.secret);
        System.out.println("Math static string using class name: " + Math.CLASS_NAME);
        System.out.println("Math static string using obj reference: " + Math.CLASS_NAME);
    }
}
