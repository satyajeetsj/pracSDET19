package com.practice;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.testng.annotations.Test;

public class ReadData_XML {
	@Test
	public void readdata_XML() throws DocumentException
	{
		File inputfile = new File("../SDET_19_demo/Resource/CommonData.xml");
		
		SAXReader reader = new SAXReader();
		Document doc = reader.read(inputfile);
		 
		String value = doc.selectSingleNode("//commondata/URL").getText();
		 
		System.out.println(value);
		
	}

}
