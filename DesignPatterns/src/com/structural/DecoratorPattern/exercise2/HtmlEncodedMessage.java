package com.structural.DecoratorPattern.exercise2;



//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message {

	private final Message msg;
	
	public HtmlEncodedMessage(Message msg) {
		this.msg = msg;
	}
	
	@Override
	public String getContent() {
		return msg.getContent();
	}

	
}
