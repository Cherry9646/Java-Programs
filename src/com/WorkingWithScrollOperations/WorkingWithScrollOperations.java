package com.WorkingWithScrollOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithScrollOperations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		
		//scroll by pixel
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)");
//		
//		Thread.sleep(4000);
//		js.executeScript("window.scrollBy(0,-500)");
		
		//scroll by visibility of web element
		
//		WebElement Element =driver.findElement(By.linkText("File Upload"));
//				
//		js.executeScript("arguments[0].scrollIntoView();",Element );
//		Element.click();
		
		//scroll to the bottom of the page
		
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,-500)");
		
		
	}

}
