package com.testing.selenium.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class gmail_contextClickDemo_mailArchive {

	public static void main(String[] args) throws InterruptedException {
		
		/***----------WebDriver-----------***/ 	
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com"); 
		
		//enter email id
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("deepakrana.softpower@gmail.com");
		//click on Next button
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(3000);
		//enter password id
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("getz@4321 ");
		//click on Next button
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(10000);
		
		//Write xpath expression for the mail item based on a subject
		String xp = "(//b[contains(.,'Following Openings (for Bangalore)')])[2]";
		//get the address of the mail item which you want to archive
		WebElement mail = driver.findElement(By.xpath(xp));
		//print the subject of the mail
		System.out.println(mail.getText());
		
		//Creating an object of Actions class
		Actions actions = new Actions(driver);
		//using Actions class object and contextClick() method, right click on the mail item
		actions.contextClick(mail).perform();
		Thread.sleep(6000);
		//click on Archive to archive the mail
		driver.findElement(By.xpath("(//div[@class='J-N-JX aDE aDD'])[1]")).click();
	}

}
