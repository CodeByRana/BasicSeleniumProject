package com.testing.selenium.css;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCssExample {

	public static void main(String[] args) {
		/***----------WebDriver-----------***/ 	
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("D:\\sheetal_mam\\html\\index.html"); 
		
		//Id invoked in text field 
		driver.findElement(By.cssSelector("input[type='textbox"));
		driver.findElement(By.cssSelector("input[id='username"));
		driver.findElement(By.cssSelector("input[class='username"));
		driver.findElement(By.cssSelector("input[value='admin"));
	}

}
