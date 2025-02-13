package com.screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
//File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(screenshot, new File(".\\Screenshots\\instagram.png"));

//section of webpage
//WebElement instagram = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/section/main/article/div[2]/div[1]"));
//File screenshot = instagram.getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(screenshot, new File(".\\Screenshots\\section.png"));

//element of webgpage
WebElement username =driver.findElement(By.xpath("//input[@name='username']"));
File screenshot = username.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshot, new File(".\\Screenshots\\username.png"));

	}

}
