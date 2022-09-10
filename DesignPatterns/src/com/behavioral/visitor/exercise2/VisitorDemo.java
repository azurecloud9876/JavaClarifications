package com.behavioral.visitor.exercise2;

public class VisitorDemo {
    public static void main(String[] args) {
        ShapeVisitor visitor = new PrintAreaVisitor();

        Shape rectangle = new Rectangle(2, 3);
        rectangle.accept(visitor);

        Shape circle = new Circle(1);
        circle.accept(visitor);
    }
}
