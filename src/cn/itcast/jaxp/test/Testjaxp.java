package cn.itcast.jaxp.test;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Testjaxp {

	/**
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		//查询所有name元素的值
		/*
		 * 1. 创建解析器工厂
		 * 2.根据解析器工厂创建解析器
		 * 3.解析xml返回document
		 */
		//1.
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		//2.
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		//3.
		Document document = builder.parse("xml/person.xml");
		//4. 得到name 元素
		NodeList list = document.getElementsByTagName("name");
		//遍历
		for (int i=0;i<list.getLength();i++){
			Node name1 = list.item(i);//得到每一个name元素
			//得到元素的值
			String s=name1.getTextContent();
			System.out.println(s);
		}
	}

}
