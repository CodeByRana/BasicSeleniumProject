package com.testing.selenium.iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo {

	public static void main(String[] args) {
		
		/***----------WebDriver-----------***/ 	
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("D:\\sheetal_mam\\html\\page2.html"); 
		
		/****--------using index of the frame - [ int value] [ index of frames starts with zero]--------****/
//		driver.switchTo().frame(0);
//		driver.findElement(By.id("t1")).sendKeys("a");		
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("t2")).sendKeys("a");
		
		/***-------//using id attribute of the frame -string--------***/
//		driver.switchTo().frame("f1");
//		driver.findElement(By.id("t1")).sendKeys("b");
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("t2")).sendKeys("b");
		
		/***------------------using name attribute of the frame -string----------------------***/
//		driver.switchTo().frame("n1");
//		driver.findElement(By.id("t1")).sendKeys("c");
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("t2")).sendKeys("c");
		
		/***--------------//using address of the frame -webelement------------------***/
		WebElement f = driver.findElement(By.className("c1"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("t1")).sendKeys("d");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("d");
	}

}
