package com.testing.selenium.listofautosuggestionvalues;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionEx_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		// Enter Selenium in google search text box
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		int count = allOptions.size();
		System.out.println("Number of values present in the dropdown is : " + count);
		String expectedValue = "selenium interview questions";
		// Print all the auto suggestion values
		for (WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(" " + text);
			// Click on Java Interview Questions
			if (text.equalsIgnoreCase(expectedValue)) {

				option.click();

				break;
			}
		}
	}
}
