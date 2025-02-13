package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExample {
	@Test
	
	public void TestFacebook() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Cherry");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.quit();
		
	}
@Test
	
	public void TestHdfc() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("Cherry");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.quit();
		
	}

}
