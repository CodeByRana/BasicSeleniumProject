package com.testing.selenium.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) throws InterruptedException {
		
		/***----------WebDriver-----------***/ 	
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("D:\\sheetal_mam\\html\\index.html"); 
		
		//Id invoked in text field 
		WebElement uID = driver.findElement(By.id("username"));
		uID.clear();
		uID.sendKeys("dipakrana2760@gmail.com");
		
		//user name invoked in text field
		WebElement uName = driver.findElement(By.name("username"));
		uName.clear();
		uName.sendKeys("Deepak");
		Thread.sleep(2000);
		
		//user name invoked in text field
		WebElement uPass = driver.findElement(By.name("pass"));
		uPass.clear();
		uPass.sendKeys("pass@12");
		
		//Button 
		driver.findElement(By.linkText("Click ActiTIME Link")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
