package com.structural.BridgePattern.exercise2;

public class GmailSender implements Sender{
    @Override
    public void sendMessage(String sub, String body) {

        System.out.println("Gmail " + sub +
            " - "
            + body);


    }
}
