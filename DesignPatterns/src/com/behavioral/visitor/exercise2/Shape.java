package com.behavioral.visitor.exercise2;


public interface Shape {
    void accept(ShapeVisitor visitor);
}
