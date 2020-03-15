package cn.itcast.jaxp.test;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class Testjaxp {

	/**
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	//�ڵ�һ��p1������ӽڵ�<sex>nv</sex>
	public static void addSex() throws Exception{
		//1.��������������
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		//2.����������
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		//3.����xml����document
		Document document = builder.parse("xml/person.xml");
		//4.�õ�����p1
		NodeList list = document.getElementsByTagName("p1");
		//5.�õ�p1
		Node p1  = list.item(0);
		//������ǩ
		Element sex1 = document.createElement("sex");
		//�����ı�
		Text text1 = document.createTextNode("women");
		//���
		sex1.appendChild(text1);
		p1.appendChild(sex1);
		//��дxml�ĵ�
		TransformerFactory transformerfactory = TransformerFactory.newInstance();
		Transformer transformer = transformerfactory.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("xml/person.xml"));
	}
	public static void selectAll() throws Exception{
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

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//addSex();
		selectAll();
	}
}
