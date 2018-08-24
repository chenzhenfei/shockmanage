package com.shock.psm.designmodel.factorymodel;

public class MessageFactory implements FactorySender{

	@Override
	public SameInterface create() {
		return new MessageSender();
	}

	
}
