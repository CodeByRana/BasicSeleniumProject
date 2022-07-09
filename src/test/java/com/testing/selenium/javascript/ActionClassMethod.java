package com.testing.selenium.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMethod {

	public static void main(String[] args) throws InterruptedException {
		
		/***----------WebDriver-----------***/ 	
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com"); 
		
		Actions action = new Actions(driver);
		WebElement webElement = driver.findElement(By.id("email"));
		action.moveToElement(webElement).click().build().perform();
		
		Thread.sleep(3000);
		
		WebElement webElement1 = driver.findElement(By.id("pass"));
		action.moveToElement(webElement1).click().build().perform();

		Thread.sleep(2000);
		driver.close();
	}

}
