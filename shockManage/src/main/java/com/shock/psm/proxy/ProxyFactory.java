package com.shock.psm.proxy;

import java.lang.reflect.Proxy;


public class ProxyFactory {

	private final Object obj;

	public ProxyFactory(Object obj) {
		this.obj = obj;
	}
	public  Object  getServiceProxy(){
		Object c =(Object)Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),new ServiceProxy(obj));
		return c;
	}
}
