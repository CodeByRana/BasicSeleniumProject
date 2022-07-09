package com.testing.selenium.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class ContextClickusingActionsClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		/***----------WebDriver-----------***/ 	
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("D:\\sheetal_mam\\html\\index.html");
		
		//find the ActiTIME Inc. link
		WebElement link = driver.findElement(By.linkText("Click ActiTIME Link"));
		//right click (context click) on actitime link
		Actions actions = new Actions(driver);
		actions.contextClick(link).perform();
		Thread.sleep(3000);
		
		//press 'w' from the keyboard for opening in a new window
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		//quit() method closes all the browsers opened by Selenium
		//driver.quit();

	}

}
