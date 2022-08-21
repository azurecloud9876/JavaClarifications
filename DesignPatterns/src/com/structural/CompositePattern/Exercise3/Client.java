package com.structural.CompositePattern.Exercise3;

public class Client {


    public static void main(String[] args) {
        Employee assocEmp1 = new AssociateEngineer(100, "Lokesh Sharma", "Pro Developer");
        Employee assocEmp2 = new AssociateEngineer(101, "Vinay Sharma", "Developer");

        Directory assocDir = new Directory();
        assocDir.addEmployee(assocEmp1);
        assocDir.addEmployee(assocEmp2);


        Employee mngEmp1 = new Manager(200, "Kushagra Garg", "SEO Manager");
        Employee mngEmp2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager");

        Directory mngDir = new Directory();
        mngDir.addEmployee(mngEmp1);
        mngDir.addEmployee(mngEmp2);

        Directory directory = new Directory();
        directory.addEmployee(assocDir);
        directory.addEmployee(mngDir);
        directory.showEmployeeDetails();


    }
}
