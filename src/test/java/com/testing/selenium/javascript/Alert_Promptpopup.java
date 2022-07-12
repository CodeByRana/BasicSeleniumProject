package com.testing.selenium.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Promptpopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.actimind.com/");
		
		//Enter the url
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		//find this button : "Say my name"
		driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
		Thread.sleep(2000);
		//Switch to alert pop up
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		//print the text present on the alert pop up
		System.out.println(alert.getText());
		Thread.sleep(2000);
		//enter your name in the text box present on the alert pop up
		alert.sendKeys("ajit");
		Thread.sleep(2000);
		//click on OK button
		alert.accept();
		Thread.sleep(2000);
		//print the text present on the second alert pop up
		System.out.println(alert.getText());
		//click on Cancel button
		alert.dismiss();
	}

}
