package com.shock.psm.xmlanalysis.dom4j;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * dom4j
 * date: 2017��11��30�� ����4:24:28 <br/>  
 * @author czf
 * @version
 */
public class Dom4jAnalysis {
	
	public static void main(String[] args) {
		try {
		String xmlpath=Dom4jAnalysis.class.getResource("/").getPath()+"/xmlfile/product.xml";
		File file =new File(xmlpath);
		SAXReader reader =new SAXReader();
		Document d =reader.read(file);
		Element root =d.getRootElement();
		Element foo;
		for(Iterator a =root.elementIterator("NAME");a.hasNext();){
			foo =(Element)a.next();
			System.out.println("��Ʒ��������:" + foo.elementText("CNAME")); 
			System.out.println("��ƷӢ������:" + foo.elementText("ENAME"));
		}
		
		
		Iterator it =root.elementIterator();
		Element single ;
		while(it.hasNext()){
			single =(Element)it.next();
		}
		
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 
	 * document�ڵ�д��xml.<br/>  
	 * @author czf 
	 * 2017��11��30������5:03:13
	 */
	public static void Dom4jWriter(){
		
	}
	/**
	 * 
	 * xml-document.<br/>  
	 * @author czf 
	 * 2017��11��30������5:03:38
	 */
	public static void Dom4jReader(){
		
	}
	

	
	
	
}
