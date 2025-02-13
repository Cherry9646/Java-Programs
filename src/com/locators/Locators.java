package com.locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
          ChromeDriver driver = new ChromeDriver();
          
        //  <input aria-label="Phone number, username, or email" aria-required="true" autocapitalize="off" autocorrect="off" maxlength="75" class="_aa4b _add6 _ac4d _ap35" dir="" type="text" value="" name="username">
          driver.get("https://www.instagram.com/");
          driver.findElement(By.name("username")).sendKeys("9959829646");
          driver.findElement(By.name("password")).sendKeys("charanteja3333");
          //driver.findElement(By.linkText("Log in")).click();
	 WebElement Login=  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/section/main/article/div[2]/div[1]/div[2]/div/form/div[1]/div[3]/button/div"));
	  Login.click();
	}

}
