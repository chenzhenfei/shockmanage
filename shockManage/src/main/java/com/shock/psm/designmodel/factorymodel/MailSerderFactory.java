package com.shock.psm.designmodel.factorymodel;


public class MailSerderFactory implements FactorySender {

	@Override
	public SameInterface create() {
		return new MailSender();
	}

}
