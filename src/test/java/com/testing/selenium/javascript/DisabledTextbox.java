package com.testing.selenium.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextbox {

	public static void main(String[] args) throws InterruptedException {
		
		/***----------WebDriver-----------***/ 	
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("D:\\sheetal_mam\\html\\disableTextboxPro.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('t1').value='admin'");
		js.executeScript("document.getElementById('t2').value=''");
		js.executeScript("document.getElementById('t2').value='manager'");
		js.executeScript("document.getElementById('t2').type='button'");
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
