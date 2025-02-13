package com.validaatingaplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_an_application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
        ChromeDriver driver =  new ChromeDriver();
             driver.get("https://www.bing.com/");
             driver.manage().window().maximize();
           
             
             String ExpectedTitle = "Bing";
            System.out.println(ExpectedTitle);
           String ActualTitle = driver.getTitle();
           System.out.println(ActualTitle);
           
           if(ExpectedTitle.equals(ActualTitle)) {
        	   System.out.println("true");
           }
           else
           {
        	   System.out.println("flase");
           }
           if(ExpectedTitle.equalsIgnoreCase(ActualTitle)) {
        	   System.out.println("true");
           }
           else
           {
        	   System.out.println("flase");
           }
           if(ActualTitle.contains(ExpectedTitle)) {
        	   System.out.println("true");
           }
           else
           {
        	   System.out.println("flase");
           }
	}

}
