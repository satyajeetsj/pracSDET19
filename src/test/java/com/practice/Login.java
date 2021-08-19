package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("../SDET_19_demo/Resource/CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(prop.getProperty("UN"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(prop.getProperty("PWD"));
		driver.findElement(By.id("submitButton")).click();
		
		

	}

}
