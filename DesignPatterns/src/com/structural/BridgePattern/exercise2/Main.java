package com.structural.BridgePattern.exercise2;

public class Main {
    public static void main(String[] args) {
        Sender gmail = new GmailSender();
        Sender outlook=  new OutlookSender();


        SystemMessage systemMessage = new SystemMessage();

        systemMessage.subject = "---";
        systemMessage.body="titi mlil";
        systemMessage.sender=gmail;
        systemMessage.send();


        Message message = new SystemMessage();
        message.subject = " the subject " ;
        message.body = "the body of the message";
        message.sender = gmail;
        message.send();
        UserMessage userMessage = new UserMessage();

     //   Message message1 = new UserMessage();

        userMessage.subject="user subject ";
        userMessage.body="the user body";
        userMessage.UserComments="this Message is a user comment ";

        userMessage.sender=outlook;
        userMessage.send();

    }
}
