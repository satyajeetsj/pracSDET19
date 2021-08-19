package com.practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MMT_withDataprovider {
	@Test(dataProvider="getvalues")
	public void cities(String src, String dest) throws InterruptedException{
		
		Date d=new Date();
		System.out.println(d.toString());
		String currentdate = d.toString();
		String[] arr=currentdate.split(" ");
		
		String day = arr[0];
		String month = arr[1];
		String todaysdate = arr[2];
		String year = arr[5];
		String MMT_Date = day+" "+month+" "+todaysdate+" "+year;
		System.out.println(MMT_Date);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		
		driver.findElement(By.id("fromCity")).sendKeys(src);
		driver.findElement(By.xpath("//div[.='"+src+"']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(dest);
		driver.findElement(By.xpath("//div[.='"+dest+"']")).click();
		
		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='"+MMT_Date+"']")).click();

	}
	
	
	public void selectcities(String s1, String s2)
	{
		System.out.println(s1+" "+s2);
	}
	
	@DataProvider
	public Object[][] getvalues()
	{
		Object[][] arr=new Object[5][2];
		
		arr[0][0]="GOI";
		arr[0][1]="BLR";
		
		arr[1][0]="MYQ";
		arr[1][1]="DEL";
		
		arr[2][0]="PNQ";
		arr[2][1]="BLR";
		
		arr[3][0]="DEL";
		arr[3][1]="BOM";
		
		arr[4][0]="BOM";
		arr[4][1]="DEL";
		
		
		return arr;
	}


}
