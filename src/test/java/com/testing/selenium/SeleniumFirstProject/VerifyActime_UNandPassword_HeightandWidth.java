package com.testing.selenium.SeleniumFirstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyActime_UNandPassword_HeightandWidth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//find the username field
		WebElement unTB = driver.findElement(By.id("j_username"));
		//store the height of username
		int username_height = unTB.getSize().getHeight();
		//store the width of username
		int username_width = unTB.getSize().getWidth();
		System.out.println(username_height);
		System.out.println(username_width);
		//find the password field
		WebElement pwdTB = driver.findElement(By.name("j_password"));
		//store the height of password
		int password_height = pwdTB.getSize().getHeight();
		//store the width of password
		int password_width = pwdTB.getSize().getWidth();

		System.out.println(password_height);
		System.out.println(password_width);
		
		//check the height and width of username and password fields are same
		if (username_height==password_height && username_width==password_width) {
		System.out.println("Username and password fields are aligned");
		}else{
		System.out.println("Username and password fields are NOT aligned");
		}
		driver.close();
	}

}
