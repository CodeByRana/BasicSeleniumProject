package com.testing.selenium.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot_ActiTIMEPage {

	public static void main(String[] args) throws IOException {
		
		/***----------WebDriver-----------***/ 	
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\screenshot");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String webURL = "https://www.facebook.com/";
		driver.get(webURL);
		
		/***----------Screenshot-----------***/
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".\\screenshot\\" + "fb_login" +".png");
		FileHandler.copy(srcFile, destFile);
	}

}
