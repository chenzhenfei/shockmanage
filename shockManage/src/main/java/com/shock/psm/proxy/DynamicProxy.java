package com.shock.psm.proxy;

import com.shock.psm.services.HelloService;
import com.shock.psm.services.HelloServiceImpl;


/**
 * 动态代理 和静态代理 date: 2018年7月16日 下午4:55:16 <br/>
 * 
 * @author czf
 * @version
 */
public class DynamicProxy {
	public static void main(String[] args){
		HelloService hs =new HelloServiceImpl();
		HelloService c=(HelloService)new ProxyFactory(hs).getServiceProxy();
		
		c.sayHello();
	}
}
