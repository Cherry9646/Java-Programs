package com.WorkingwithKeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithKeyBoardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/text-box");
		
	JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");

		driver.findElement(By.id("userName")).sendKeys("Charan");
		driver.findElement(By.id("userEmail")).sendKeys("Charan@gamil.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Charan@gamil.com");
	
		WebElement PermanentADD =driver.findElement(By.id("permanentAddress"));
		
		Actions action = new Actions(driver);
		
	//select the text  // CTRL+A
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
	//copy the text //CTRL+C
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
    //move the Tab
		
		action.sendKeys(Keys.TAB);
		action.perform();
		
     // paste the text   //CTRL+V		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		
	
	
	}

}
