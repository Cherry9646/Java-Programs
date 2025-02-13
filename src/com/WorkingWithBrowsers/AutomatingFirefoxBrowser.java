package com.WorkingWithBrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomatingFirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.gecko.driver","C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles1\\geckodriver.exe");
	
	     FirefoxDriver obj1 = new  FirefoxDriver();
	     obj1.get("https://www.flipkart.com/");
	     
	}

}
