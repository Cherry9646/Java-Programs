package com.locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Foregotten password link // create a page

public class LocatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
	          ChromeDriver driver =  new ChromeDriver();
	          driver.get("https://www.facebook.com/");
	          //linkText
	          //driver.findElement(By.linkText("Forgotten password?")).click();
	          
	          //partialinkText
	        //  driver.findElement(By.partialLinkText("Forgotten")).click();
	          
	          //tagname
//	          List<WebElement> links =driver.findElements(By.tagName("a"));
//	          System.out.println(links.size());

	           //linkText
	       //driver.findElement(By.linkText("Create a Page")).click();   
	       
	          //partial linkText
	             driver.findElement(By.partialLinkText("a Page")).click();
		}

}

