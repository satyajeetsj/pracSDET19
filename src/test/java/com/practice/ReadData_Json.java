package com.practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadData_Json {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader inputfile=new FileReader("../SDET_19_demo/sdet19.json");
		
		//Parsing the object
		JSONParser parser =new JSONParser();
		Object obj = parser.parse(inputfile);
		
		HashMap jobj = (HashMap) obj;
		
		String value = jobj.get("UN").toString();
		System.out.println(value);
		

	}

}
