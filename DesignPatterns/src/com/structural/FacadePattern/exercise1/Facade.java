package com.structural.FacadePattern.exercise1;

public class Facade {
    Subsystem1 subsystem1;
    Subsystem2 subsystem2;

    public Facade(Subsystem1 subsystem1, Subsystem2 subsystem2) {
        this.subsystem1 = subsystem1;
        this.subsystem2 = subsystem2;
    }
  public String Operation(){
        String result = "\nFacade initialized subsystems \n";
        result+=subsystem1.Operation1();
        result+=subsystem2.Operation1();
        result+=" \n Facade Subsystems to perform the action";
      result+=subsystem1.Operation2();
      result+=subsystem2.Operation2();
      return result;
  }

}
