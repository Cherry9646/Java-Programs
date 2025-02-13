package com.MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActionsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.greenstechnologys.com/");
      WebElement mouse=   driver.findElement(By.linkText("Certifications"));
      Actions action = new Actions(driver);
      action.moveToElement(mouse).build().perform();
      
      
      Thread.sleep(5000);
     // driver.findElement(By.linkText("Certifications")).click();
      
      
	}

}
