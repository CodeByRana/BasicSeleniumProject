package com.testing.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpcastingToWebDriver_LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println("page title :" + pageTitle);
		String pageSource = driver.getPageSource();
		System.out.println("page source :"+pageSource);
		
		driver.findElement(By.id("email")).sendKeys("Deepak");
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
