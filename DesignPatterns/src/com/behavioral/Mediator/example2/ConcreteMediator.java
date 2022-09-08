package com.behavioral.Mediator.example2;

public class ConcreteMediator implements IMediator {

    ColleagueA talk;
    ColleagueB fight;

    @Override
    public void talk() {
        System.out.println("Mediator is talking");
    }

    @Override
    public void fight() {
        System.out.println("Mediator is fighting");
    }

    @Override
    public void registerA(ColleagueA a) {
        this.talk = a;
    }

    @Override
    public void registerB(ColleagueB b) {
        this.fight = b;
    }
}
