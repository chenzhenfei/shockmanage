package com.shock.psm.designmodel.abstractfactory;

public class MailFactory  implements AbstractSender{

	@Override
	public AbstractSend send() {
		return new MailSend();
	}

	@Override
	public AbstractReceive receive() {
		return new MailRecevice();
	}

}
