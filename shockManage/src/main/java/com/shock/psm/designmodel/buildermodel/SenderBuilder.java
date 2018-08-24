package com.shock.psm.designmodel.buildermodel;

import java.util.List;

import com.shock.psm.designmodel.factorymodel.MailSender;
import com.shock.psm.designmodel.factorymodel.MessageSender;
import com.shock.psm.designmodel.factorymodel.SameInterface;

public class SenderBuilder {
	
	private List<SameInterface>  sender_list ;
	
	public void buildMailSender(int count){
		for(int i=0;i<count;i++){
			sender_list.add(new MailSender());
		}
	} 
	public void buildMessageSender(int count){
		for(int i=0;i<count;i++){
			sender_list.add(new MessageSender());
		}
	} 

}
