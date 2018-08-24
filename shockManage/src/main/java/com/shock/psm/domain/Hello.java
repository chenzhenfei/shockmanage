package com.shock.psm.domain;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * 
 * date: 2018年7月20日 下午3:24:29 <br/>  
 * @author czf
 * @version
 */
/**
 * javabean to xml 的api实现
 */
@XmlRootElement
public class Hello {
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
