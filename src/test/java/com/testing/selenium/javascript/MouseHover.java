package com.testing.selenium.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.actimind.com/");
		
		Actions action = new Actions(driver);
		//movetoElement - used for mouse hover
		//Mouse hover on “AREAS OF EXPERTISE” menu
		WebElement AreaOfExpertise = driver.findElement(By.xpath("//a[contains(text(),'AREAS OF EXPERTISE')]"));
		action.moveToElement(AreaOfExpertise).perform();
		//Click on “AREAS OF EXPERTISE” menu
		WebElement cloudApp = driver.findElement(By.linkText("Cloud Applicationss"));
		action.moveToElement(cloudApp).click().perform();
		//composite multiple actions can be achieved using the below statement
		//action.moveToElement(AreaOfExpertise).moveToElement(cloudApp).click().build().perform();
	}

}
