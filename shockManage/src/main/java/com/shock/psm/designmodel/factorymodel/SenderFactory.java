package com.shock.psm.designmodel.factorymodel;

public class SenderFactory {
	
	// �򵥹�������̬��������ģʽ  
	
	// �򵥹�����1 ��������
	
	// ��ͨ����ģʽ �� ͨ�����ݵ� ���ֲ�Ʒ�����ԣ������ش�����Ӧ�Ĳ�Ʒ
	public SameInterface produre(String type){
		if("1".equals(type)){
			return new MailSender();
		}else{
			return new MessageSender();
		}
	}
	
	// �򵥹�����2  �����������
	
	public MailSender produreMailSender(){
		return new MailSender();
	}
	
	public MessageSender produreMessageSender(){
		return new MessageSender();
	}
	
	
	
	
	

}
