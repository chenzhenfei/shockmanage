package com.shock.psm.services;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.shock.psm.domain.Hello;


@Service("helloServiceImpl")
public class HelloServiceImpl implements HelloService{
	
	/**
	 * 确保一致性采用final, 线程安全
	 */
	private final ConcurrentHashMap<Integer, Hello> resposity =new ConcurrentHashMap<Integer, Hello>() ;

	
	/**
	 * 原子自增序列
	 */
	private final AtomicInteger ato =new AtomicInteger();
	
	@Override
	public Hello sayHello() {
		Hello hello =new Hello() ;
		hello.setId(1);
		hello.setName("hello");
		return hello;
	}

	@Override
	public void sayBeyBey(Hello hello) {
		Integer id =ato.getAndIncrement();
		hello.setId(id);
		resposity.put(id, hello);
	}
	

}
