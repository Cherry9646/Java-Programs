package com.WorkingonEditboxorTextBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingonEditboxorTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
        ChromeDriver driver =  new ChromeDriver();
             driver.get("https://login.salesforce.com/");
             driver.manage().window().maximize();
             
              WebElement UserName =driver.findElement(By.id("username"));
              UserName.sendKeys("Charan");
              
             WebElement PassWord= driver.findElement(By.id("password"));
             PassWord.sendKeys("Cherry124");
             
             String UN=UserName.getAttribute("value");
             System.out.println(UN);
             String PW= PassWord.getAttribute("value");
             System.out.println(PW);
             if(UN.equals(PW)) {
            	 System.out.println("true");
             }
             else {
            	 System.out.println("false");
             }
	}

}
