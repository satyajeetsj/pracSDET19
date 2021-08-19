package com.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_MMT {
	@Test(dataProvider="getvalues")
	public void selcetcities(String s1, String s2)
	{
		System.out.println(s1+" "+s2);
	}
	
	@DataProvider
	public Object[][] getvalues()
	{
		Object[][] arr=new Object[5][2];
		
		arr[0][0]="bengaluru";
		arr[0][1]="goa";
		
		arr[1][0]="mysore";
		arr[1][1]="delhi";
		
		arr[2][0]="pune";
		arr[2][1]="bengaluru";
		
		arr[3][0]="delhi";
		arr[3][1]="mumbai";
		return arr;
	}

}
