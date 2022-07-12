package com.testing.selenium.webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUNandPWDalignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement unTB = driver.findElement(By.id("j_username"));
		int un_x = unTB.getLocation().getX();
		int un_width = unTB.getSize().getWidth();
		int un_height = unTB.getSize().getHeight();
		WebElement pwTB = driver.findElement(By.name("j_password"));
		int pw_x = pwTB.getLocation().getX();
		int pw_width = pwTB.getSize().getWidth();
		int pw_height = pwTB.getSize().getHeight();
		
		if (un_x == pw_x && un_width==pw_width && un_height==pw_height) {
		System.out.println("Username and password text box are aligned");
		} else {
		System.out.println("Username and password text box are NOT aligned");
		}
		driver.close();
	}

}
