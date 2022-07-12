package com.testing.selenium.webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_selectedorNot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement KeepMeLogIN_Checkbox = driver.findElement(By.name("remember"));
		//select the checkbox
		KeepMeLogIN_Checkbox.click();
		
		if (KeepMeLogIN_Checkbox.isSelected()) {
		System.out.println("Checkbox is selected");
		}else{
		System.out.println("Checkbox is NOT selected");
		}
	}

}
