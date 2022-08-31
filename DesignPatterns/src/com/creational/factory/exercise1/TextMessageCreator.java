package com.creational.factory.exercise1;


import com.creational.factory.exercise1.message.Message;
import com.creational.factory.exercise1.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}


}
