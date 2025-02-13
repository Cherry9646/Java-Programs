package com.SingleDropDownButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDownButtonsExample {

	public static void main(String[] args) throws InterruptedException

	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://omayo.blogspot.com/");
	      driver.manage().window().maximize();
	    WebElement Dropdown=  driver.findElement(By.id("drop1"));
	    
	    Select select = new Select(Dropdown);
	    List<WebElement> dropdowns=   select.getOptions();
	    int options =dropdowns.size();
	    System.out.println(options);
//	    for(int i=0;i<dropdowns.size();i++) {
//	    	System.out.println(dropdowns.get(i).getText());
//	    		    }
	    //or
	     for(WebElement option:dropdowns ) {
	    	 System.out.println(option.getText());
	    	 
	     }
	
	     select.selectByIndex(2);
	     Thread.sleep(5000);
	     select.selectByValue("jkl");
	     Thread.sleep(5000);
	     select.selectByVisibleText("doc 4");
          WebElement values=select.getFirstSelectedOption();
          System.out.println(values.getText());
          List<WebElement> value =select.getAllSelectedOptions();
          for(WebElement we:value) {
        	  System.out.println(we.getText());
        	  
          }
	}

}
