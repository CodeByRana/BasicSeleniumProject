package com.testing.selenium.fbregis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class feceBookRegTestNG {

	private WebDriver driver;
	private String URL = "http://www.facebook.com";

	@Parameters("browser")
	@BeforeTest
	public void launchapp(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Executing on CHROME");
			System.setProperty("webdriver.chrome.driver",
					"C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Executing on FireFox");
			System.setProperty("webdriver.gecko.driver",
					"C:\\CFP-program\\BasicSelenumProject\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.out.println("Executing on IE");
			System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else {
			throw new IllegalArgumentException("The Browser Type is Undefined");
		}
	}

	@Test
	public void registration() throws InterruptedException {
		String fName = "Deepak";
		String lName = "Rana";
		String mobNum = "7011133639";
		String pwd = "pass@123";
		
		  System.out.println(driver.getTitle());
		  driver.findElement(By.linkText("Create New Account")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fName);
		  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lName);
		  driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys(mobNum);
		  driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys(pwd);
		  Select dd = new Select(driver.findElement(By.xpath("//select[@name='birthday_day' and @id='day']")));
		  dd.selectByValue("22");
		  Select mm = new Select(driver.findElement(By.xpath("//select[@name='birthday_month' and @id='month']")));
		  mm.selectByValue("3");
		  Select yy = new Select(driver.findElement(By.xpath("//select[@name='birthday_year' and @id='year']")));
		  yy.selectByValue("1992");
		  driver.findElement(By.cssSelector("input[value='2']")).click();
		  driver.findElement(By.name("websubmit")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
