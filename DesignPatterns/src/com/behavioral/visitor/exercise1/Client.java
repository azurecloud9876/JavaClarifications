package com.behavioral.visitor.exercise1;

import java.util.Date;
import java.util.Random;
/*
 * ******************* Behavioral Design pattern *************
 * Context: Performing operations on elements of an aggregate.
 * Problem: How to execute some behavior on an aggregate of different objects.
 * Forces:
 *    - Object aggregate contains different interfaces.
 *    - Avoid polluting classes with unrelated operations.
 *    - Structure rarely changes.
 * Solution :
 *    - Implement the functionality for each different object type in an visitor.
 *    - Implement means to apply the visitor to every object.
 * Consequences:
 *    + Makes adding new functionality easy
 *    + Combines related functions.
 *    + Account for different object types.
 *    + Can accumulate state.
 *    ~ Who traverses the aggregate? How ?
 *    ~ Double-Dispatch or not?
 *    - Adding new class types is expensive
 *    - Visitor may need access to private members (breaks encapsulation)
 * 1. Do you have a use case where additional behaviors needs to be added to entity without changing it again and again.
 * 2. Do you have a use case where an entity can be acted upon by different entities to perform any operation.
 *
 * */
public class Client {

    public static void main(String[] args) {
        Employee emps = buildOrganization();
        Visitor visitor = new PrintVisitor();

        visitOrgStructure(emps, visitor);
        System.out.println("***************************************");
        //Perform a fake appraisal
        appraisal(emps, new Random(new Date().getTime()));

        AppraisalVisitor visitor2 = new AppraisalVisitor();
        //Carry out final appraisal where we consider team performance
        visitOrgStructure(emps, visitor2);

        //create new print visitor with final ratings taken from appraisal visitor
        visitor = new PrintVisitor(visitor2.getFinalRatings());
        visitOrgStructure(emps, visitor);

    }

    private static Employee buildOrganization() {

        Programmer p1 = new Programmer("Rachel", "C++");
        Programmer p2 = new Programmer("Andy", "Java");

        Programmer p3 = new Programmer("Josh", "C#");
        Programmer p4 = new Programmer("Bill", "C++");

        ProjectLead pl1 = new ProjectLead("Tina", p1, p2);
        ProjectLead pl2 = new ProjectLead("Joey", p3, p4);

        Manager m1 = new Manager("Chad", pl1);
        Manager m2 = new Manager("Chad II", pl2);

        VicePresident vp = new VicePresident("Richard", m1, m2);

        return vp;
    }

    private static void visitOrgStructure(Employee emp, Visitor visitor) {
        emp.accept(visitor);
        emp.getDirectReports().forEach(e -> visitOrgStructure(e, visitor));
    }

    //This method assigns some random values to performance rating field of employees
    private static void appraisal(Employee emp, Random random) {
        int rating = random.nextInt(6);
        emp.setPerformanceRating(rating < 1 ? 1 : rating);
        emp.getDirectReports().forEach(r -> appraisal(r, random));
    }
}
