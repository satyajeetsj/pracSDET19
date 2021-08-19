package com.practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Future_date {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d.toString());
		String currentdate=d.toString();
		String[] arr = currentdate.split("");
		
		String day = arr[0];
		String month = arr[1];
		String todaysdate = arr[2];
		String year = arr[5];
		String MMT_Date = day+""+month+""+todaysdate+""+year;
		System.out.println(MMT_Date);
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		
		driver.findElement(By.id("fromCity")).sendKeys("bom");
		driver.findElement(By.xpath("//div[.='BOM']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("pune");
		driver.findElement(By.xpath("//div[.='PNQ']")).click();
		
		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
		int count=0;
		while(count<=11){
			try{
				driver.findElement(By.xpath("//div[@aria-label='Tue Nov 09 2021']")).click();
			}
			catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				count++;
			}
		}
		
		

	}

}
