package com.testing.selenium.javascript;

import java.util.Date;

public class Day15_Program2_HiddenDivisionPopup_CalendarPopup_cleartrip_selectTodaysDate {

	public static void main(String[] args) {
		
		Date d = new Date();
		String str = d.toString();
		String[] str2 = str.split(" ");
		String today = str2[2];
		
		System.setProperty("webdriver.chrome.driver", "C:\\CFP-program\\BasicSelenumProject\\Drivers\\chromedriver.exe");
		
	}

}
