package com.WorkingWithTabHandlings;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTabHandlings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
        ChromeDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
             driver.get("https://accounts.google.com/");
           WebElement Help=  driver.findElement(By.linkText("Help"));
           String Handle =driver.getWindowHandle();
           System.out.println(Handle);
             Help.click();
             Set<String> Handles=driver.getWindowHandles();
             System.out.println(Handles);
             if(Handle.equals(Handles)) {
            	 System.out.println("true");
            	             	 
             }
             else {
            	 System.out.println("false");
            	 
             }
	}

}
