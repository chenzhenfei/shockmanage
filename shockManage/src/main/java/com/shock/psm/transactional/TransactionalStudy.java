package com.shock.psm.transactional;

import javax.transaction.Transactional;


@Transactional
public class TransactionalStudy {
	
	
	public void methodA(){
		System.out.println("methodA");
	}
	
	public void methodB(){
		System.out.println("methodB");
	}
	
	public void methodC(){
		System.out.println("methodC");
	}
	
	
	public static void main(String[] args){
			
	}
}
