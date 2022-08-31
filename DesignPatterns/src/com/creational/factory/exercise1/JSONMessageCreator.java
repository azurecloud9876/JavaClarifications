package com.creational.factory.exercise1;


import com.creational.factory.exercise1.message.JSONMessage;
import com.creational.factory.exercise1.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}


}
