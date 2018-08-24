package com.shock.psm.designmodel.abstractfactory;

public class MessageFactory implements AbstractSender{

	@Override
	public AbstractSend send() {
		return new MessageSend();
	}

	@Override
	public AbstractReceive receive() {
		return new MessageReceive();
	}

}
