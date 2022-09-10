package com.behavioral.visitor.exercise1;

public interface Visitor {

    void visit(Programmer programmer);

    void visit(ProjectLead lead);

    void visit(Manager manager);

    void visit(VicePresident vp);
}
