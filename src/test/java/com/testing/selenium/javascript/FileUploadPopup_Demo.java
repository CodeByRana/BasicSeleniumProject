package com.testing.selenium.javascript;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup_Demo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("http://www.actimind.com/");
		
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("D:\\Ajit\\testdata\\Absolute xpath examples.xlsx");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
