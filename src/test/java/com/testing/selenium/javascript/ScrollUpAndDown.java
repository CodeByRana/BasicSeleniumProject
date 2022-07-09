package com.testing.selenium.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		/***----------WebDriver-----------***/ 	
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://seleniumhq.org/download");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(int i = 1; i<10; i++) {
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(3000);
		}
		for(int i = 1; i<10; i++) {
			js.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(3000);
		}
		
		driver.close();
	}

}
