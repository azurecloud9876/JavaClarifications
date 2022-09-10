package com.behavioral.state.exercise2;

public class ConcreteState2 implements Istate {
    @Override
    public void Handle(Context context) {
        System.out.println("handel called from Concrete State 2");
        context.State = new ConcreteState1();
    }
}
