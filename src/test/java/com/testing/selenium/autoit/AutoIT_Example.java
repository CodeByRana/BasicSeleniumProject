package com.testing.selenium.autoit;

import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoIT_Example {
	@Test
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		Thread.sleep(3000);
		// Using Runtime class, to run the .exe file
		Runtime run = Runtime.getRuntime();
		run.exec("D:\\AutoItConcept\\UploadFile.exe");
		// close the browser
		driver.close();
	}
}
