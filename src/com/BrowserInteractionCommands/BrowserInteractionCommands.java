package com.BrowserInteractionCommands;

import org.openqa.selenium.chrome.ChromeDriver;
   
public class BrowserInteractionCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
	       ChromeDriver obj1 = new ChromeDriver();
	       obj1.get("https://www.flipkart.com/");
	      Thread.sleep(5000);
	      obj1.manage().window().maximize();
	      String obj2 = obj1.getPageSource();
	      System.out.println(obj2);
	      String obj3 = obj1.getTitle();
	      System.out.println(obj3);
	      String obj4 =obj1.getCurrentUrl();
	      System.out.println(obj4);
	       obj1.navigate().to("https://www.amazon.in/");
	       obj1.navigate().back();
	       obj1.navigate().forward();
	       obj1.navigate().refresh();
	       obj1.close();
	       
	}

}
