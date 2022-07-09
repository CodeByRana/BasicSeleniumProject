package com.testing.selenium.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationExample {

	public static void main(String[] args) throws InterruptedException {

		// setting the path of the chrome driver executable
		System.setProperty("webdriver.chrome.driver",
				"C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");

		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Enter the url
		driver.get("http://localhost:8080/login.do");
		driver.navigate().to("http://www.gmail.com");

		Thread.sleep(3000);
		driver.navigate().back();

		Thread.sleep(3000);
		driver.navigate().forward();

		Thread.sleep(3000);
		driver.navigate().refresh();

		driver.close();
	}

}
