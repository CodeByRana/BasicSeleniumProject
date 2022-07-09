package com.testing.selenium.SeleniumFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTestForChromeBro {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		ChromeDriver cDriver = new ChromeDriver();
		cDriver.get(url);
		cDriver.manage().window().maximize();
		String pageTitle = cDriver.getTitle();
		System.out.println("Web page title :" + pageTitle);
		String URL = cDriver.getCurrentUrl();
		System.out.println("Web landed url" + URL);
		String pageSource = cDriver.getPageSource();
		System.out.println("Web Page source :" + pageSource);
		cDriver.navigate().back();
		cDriver.navigate().forward();
		// cDriver.findElement(By.id("email")).sendKeys("Deepak");
		cDriver.findElement(By.name("email")).sendKeys("Deepak");
		cDriver.findElement(By.name("pass")).sendKeys("pass@123");
		cDriver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		// cDriver.close();
		// cDriver.quit();
	}

}
