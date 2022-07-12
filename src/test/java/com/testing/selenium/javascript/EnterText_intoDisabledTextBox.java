package com.testing.selenium.javascript;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterText_intoDisabledTextBox {
	
	public static void enterText_IntoDisabledTextBox() throws InterruptedException {
		
		/***----------WebDriver-----------***/ 	
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("D:\\sheetal_mam\\html\\index.html"); 
		
		//
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		
		//
		js.executeScript("document.getElementById('username').value='admin");
	}
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. EnterText_IntoDisabled\n 2.ScrollUpAndDown\n");
		int choice = sc.nextInt();
		switch(choice) {
			case 1: enterText_IntoDisabledTextBox();
			break;
		}
	}
}

