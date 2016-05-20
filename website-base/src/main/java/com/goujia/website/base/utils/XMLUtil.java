package com.goujia.website.base.utils;

import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

public class XMLUtil {
	
	private static final Logger LOG = LoggerFactory.getLogger(XMLUtil.class);
	  /**
     * 解析xml
     * @param xml
     * @return
     * @throws DocumentException 
	 * @throws UnsupportedEncodingException 
     */
    public static Object parseXML(String strxml,Object obj) throws DocumentException, UnsupportedEncodingException{  
    	//GJWAnsAffirm cdDto = new GJWAnsAffirm();  
        SAXReader saxReader = new SAXReader();   
		try {
			Document  document = saxReader.read(new ByteArrayInputStream(strxml.getBytes("GBK")));  
			Element employees = document.getRootElement();
			StringBuffer sb=new StringBuffer();
			for (Iterator i = employees.elementIterator(); i.hasNext();) {			
				Element employee = (Element) i.next();
				if(employee.getName().endsWith("signature")){
					sb.append('"'+employee.getName()+'"'+":"+'"'+employee.getText()+'"'+",");
				}
				for (Iterator j = employee.elementIterator(); j.hasNext();) {
					Element node = (Element) j.next();
					sb.append('"'+node.getName()+'"'+":"+'"'+node.getText()+'"'+",");
					LOG.info(node.getName() + ":" + node.getText());
				}
			}
			String str=sb.toString();
			String strJson=str.substring(0, str.length()-1);
			strJson="{"+strJson+"}";
			//String jsonString = JSON.toJSONString(strJson);
			obj=JSON.parseObject(strJson,obj.getClass());
		} catch (DocumentException e) {
			LOG.info(e.getMessage());
		}
		//System.out.println("dom4j parserXml");
        return obj;  
    } 
    
    
    public static void main(String[] args) throws DocumentException {
	    String xml="<?xml version=\"1.0\" encoding=\"GBK\"?>"
+"<package>"
	+"<pub>"
		+"<orgcode>GJW</orgcode>"
		+"<txcode>20280</txcode>"
		+"<cmpdate>20150702</cmpdate>"
		+"<cmptime>110723</cmptime>"
		+"<cmptxsno >1435806443518</cmptxsno>"
		+"<orderstatus >null</orderstatus>"
	+"</pub>"
	+"<req>"
		+"<paytype>0</paytype>"
		+"<contractno>42</contractno>"
		+"<subsellerid>test</subsellerid>"
		+"<orderno>1434096099085</orderno>"
		+"<amount>0.3000</amount>"
		+"<mobile>null</mobile>"
	+"</req>"
	+"<signature>JOTMLpvd2u85ZAzqmhiIiGuLCylYJHQWogR097YIErDDYjONwdaLMseiaZixdh1cz5Vsap4u/A79"
		+"tk/K8jXugn2cZ/iN9Pgy9Mwn2DGtlyf43rq3+tG/xPyDlhs14oEbOpumoUOgUDGReYveDnj4JXvX"
		+"P2i+nKzMxPGMfzA/nxQ="
	+"</signature>"
	+"</package>";
	    
	  //  XMLUtil.parseXML(xml,new GJBBankVerify());
	    
    }
    
    /**
     * 创建xml 测试
     * @param fileName
     */
    public void createXml(String fileName) {
		Document document = DocumentHelper.createDocument();
		Element employees = document.addElement("employees");
		Element employee = employees.addElement("employee");
		Element name = employee.addElement("name");
		name.setText("ddvip");
		Element sex = employee.addElement("sex");
		sex.setText("m");
		Element age = employee.addElement("age");
		age.setText("29");
		try {
			Writer fileWriter = new FileWriter(fileName);
			XMLWriter xmlWriter = new XMLWriter(fileWriter);
			xmlWriter.write(document);
			xmlWriter.close();
		} catch (IOException e) {

			System.out.println(e.getMessage());
		}

	}
}
