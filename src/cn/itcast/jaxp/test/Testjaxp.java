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
	//在第一个p1下面添加节点<sex>nv</sex>
	public static void addSex() throws Exception{
		//1.创建解析器工厂
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		//2.创建解析器
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		//3.解析xml返回document
		Document document = builder.parse("xml/person.xml");
		//4.得到所有p1
		NodeList list = document.getElementsByTagName("p1");
		//5.得到p1
		Node p1  = list.item(0);
		//创建标签
		Element sex1 = document.createElement("sex");
		//创建文本
		Text text1 = document.createTextNode("women");
		//添加
		sex1.appendChild(text1);
		p1.appendChild(sex1);
		//回写xml文档
		TransformerFactory transformerfactory = TransformerFactory.newInstance();
		Transformer transformer = transformerfactory.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("xml/person.xml"));
	}
	public static void selectAll() throws Exception{
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

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//addSex();
		selectAll();
	}
}
