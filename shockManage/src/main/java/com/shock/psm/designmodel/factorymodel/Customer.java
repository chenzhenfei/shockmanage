package com.shock.psm.designmodel.factorymodel;

public class Customer {

	public static void main(String[] args) {
		FactorySender fs1 = new MailSerderFactory();
		FactorySender fs2 = new MessageFactory();
		SameInterface s1=fs1.create();
		SameInterface s2=fs2.create();
		s1.send();
		s2.send();
	}

}
