package com.Utility;

import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			System.out.println("cherry");
			facebooklog.info("charan");
	}

}
