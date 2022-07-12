package com.testing.selenium.fbregis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookReg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		        String fName= "Deepak";
		        String lName="Rana";
		        String mobNum="7011133639";
		        String pwd = "pass@123";
		  // Open FaceBook
		  driver.get("http://facebook.com");

		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Create New Account")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.name("firstname")).sendKeys(fName);
		  driver.findElement(By.name("lastname")).sendKeys(lName);
		  driver.findElement(By.name("reg_email__")).sendKeys(mobNum);
		  driver.findElement(By.name("reg_passwd__")).sendKeys(pwd);
		  Select dd = new Select(driver.findElement(By.name("birthday_day")));
		  dd.selectByValue("22");
		  Select mm = new Select(driver.findElement(By.name("birthday_month")));
		  mm.selectByValue("3");
		  Select yy = new Select(driver.findElement(By.name("birthday_year")));
		  yy.selectByValue("1992");
		  driver.findElement(By.cssSelector("input[value='2']")).click();
		  driver.findElement(By.name("websubmit")).click();

		  try {
		   Thread.sleep(5000);
		  } catch (InterruptedException e) {
		   e.printStackTrace();
		  }

		  // Close Test
		  //driver.close();

	}

}
