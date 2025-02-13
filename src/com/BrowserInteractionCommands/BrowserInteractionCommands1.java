package com.BrowserInteractionCommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInteractionCommands1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver","C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe" );
	      ChromeDriver obj = new ChromeDriver();
	      obj.get("https://www.ajio.com/");
	      String obj2 = obj.getTitle();
          System.out.println(obj2);
           String obj3 =obj.getCurrentUrl();
           System.out.println(obj3);
	      //Thread.sleep(5000);
	       obj.navigate().to("https://www.meesho.com/");	
	       obj.manage().window().maximize();
	       obj.navigate().back();
	      obj.navigate().forward();
          String obj1 = obj.getTitle();
          System.out.println(obj1);
	
	}

}
