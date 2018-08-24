package com.shock.psm.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ServiceProxy implements InvocationHandler{
	private Object obj;

	public ServiceProxy(Object obj) {
		this.obj = obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("前置增强");
		Object o=method.invoke(obj, args);
		System.out.println("后置增强");
		return o;
	}
	

}
