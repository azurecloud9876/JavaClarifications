package com.structural.BridgePattern.exercise2;

public abstract class Message {
    public Sender sender;
    public String subject;
    public String body;

    public abstract void send();

}
