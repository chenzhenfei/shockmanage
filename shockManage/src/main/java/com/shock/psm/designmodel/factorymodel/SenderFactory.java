package com.shock.psm.designmodel.factorymodel;

public class SenderFactory {
	
	// 简单工厂：静态工厂方法模式  
	
	// 简单工厂：1 单个方法
	
	// 普通工厂模式 ： 通过传递的 区分产品的属性，来返回创建对应的产品
	public SameInterface produre(String type){
		if("1".equals(type)){
			return new MailSender();
		}else{
			return new MessageSender();
		}
	}
	
	// 简单工厂：2  多个工厂方法
	
	public MailSender produreMailSender(){
		return new MailSender();
	}
	
	public MessageSender produreMessageSender(){
		return new MessageSender();
	}
	
	
	
	
	

}
