package com.testing.selenium.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownMenu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.actimind.com/");
		
		//find the menu "About Company"
		String xp = "//span[.='About Company']";
		WebElement menu = driver.findElement(By.xpath(xp));
		//mouse hover on "About Company" menu
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();

		//click on submenu "Basic Facts"
		WebElement submenu = driver.findElement(By.linkText("Basic Facts"));
		submenu.click();
	}

}
