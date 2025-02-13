package com.DropDownButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDopdownButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://omayo.blogspot.com/");
	      driver.manage().window().maximize();
	     WebElement Elements = driver.findElement(By.id("multiselect1"));
	           Select select = new Select(Elements);
	           List<WebElement> options =select.getOptions();
	           int optionsIndex =options.size();
	           System.out.println(optionsIndex);
//	           for(int i=0; i<options.size(); i++) {
//	        	   System.out.println(options.get(i).getText());
//	           }
	           //or
	           for(WebElement values :options ) {
	        	   System.out.println(values.getText());	        	   
	           }
	           select.selectByIndex(0);
	           Thread.sleep(2000);	           
	           select.selectByValue("swiftx");
	           Thread.sleep(2000);
	           select.selectByVisibleText("Hyundai");
	           Thread.sleep(2000);
	           WebElement First =select.getFirstSelectedOption();
	        System.out.println(First.getText());
	                List<WebElement>Alloptions=select.getAllSelectedOptions();
	                for(WebElement optionvalues: Alloptions) {
	                System.out.println("selected text="+" "+optionvalues.getText());
	                	
	                }
	}
}
