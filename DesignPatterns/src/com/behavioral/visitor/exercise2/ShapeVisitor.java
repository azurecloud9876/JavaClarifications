package com.behavioral.visitor.exercise2;


interface ShapeVisitor {
    void visit(Rectangle rectangle);

    void visit(Circle circle);
}
