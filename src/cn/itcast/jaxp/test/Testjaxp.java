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
		//��ѯ����nameԪ�ص�ֵ
		/*
		 * 1. ��������������
		 * 2.���ݽ�������������������
		 * 3.����xml����document
		 */
		//1.
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		//2.
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		//3.
		Document document = builder.parse("xml/person.xml");
		//4. �õ�name Ԫ��
		NodeList list = document.getElementsByTagName("name");
		//����
		for (int i=0;i<list.getLength();i++){
			Node name1 = list.item(i);//�õ�ÿһ��nameԪ��
			//�õ�Ԫ�ص�ֵ
			String s=name1.getTextContent();
			System.out.println(s);
		}
	}

}
