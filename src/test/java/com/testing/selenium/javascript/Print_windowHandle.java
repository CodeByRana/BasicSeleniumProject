package com.testing.selenium.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_windowHandle {
	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.get("http://localhost:8080/login.do");
			//get the window handle id of the browser
			String windowHandle = driver.getWindowHandle();

			System.out.println(windowHandle);
		}
}
