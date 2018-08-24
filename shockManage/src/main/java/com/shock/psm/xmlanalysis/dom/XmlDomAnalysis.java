package com.shock.psm.xmlanalysis.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 * dom
 * date: 2017��11��30�� ����4:08:38 <br/>  
 * @author czf
 * @version
 */
public class XmlDomAnalysis {

	public static void main(String[] args) {
		try {
			
			String a =XmlDomAnalysis.class.getResource("/").getPath();
			File f = new File(a+"xmlfile/product.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder;
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse(f);
			NodeList nl = doc.getElementsByTagName("NAME");
			for (int i= 0;i< nl.getLength();i++){   
				System.out.println("��Ʒ��������:" + doc.getElementsByTagName("CNAME").item(i).getFirstChild().getNodeValue());
				System.out.println("��ƷӢ������:" + doc.getElementsByTagName("ENAME").item(i).getFirstChild().getNodeValue());
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
