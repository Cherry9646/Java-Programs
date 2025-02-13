package com.DropDownButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singledropdowns1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
	     ChromeDriver driver =new ChromeDriver();
	     driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
	     driver.manage().window().maximize();
	 WebElement Elements =    driver.findElement(By.name("coffee"));
	      Select select = new Select(Elements);
	   List<WebElement> optionsindex=  select.getOptions();
	  int index= optionsindex.size();
	     System.out.println(index);
//	     for(int i=0; i<optionsindex.size();i++) {
//	    	 System.out.println(optionsindex.get(i).getText());	    	 
//	     }
	     //or
	     for(WebElement options:optionsindex ) {
	    	 System.out.println(options.getText());
	     }
	     
	    select.selectByIndex(2);
	    Thread.sleep(2000);
	    select.selectByValue("black");
	    Thread.sleep(2000);
	    select.selectByVisibleText("With cream");
	    Thread.sleep(2000);
	    WebElement values =select.getFirstSelectedOption();
	    System.out.println(values.getText());
	    	    	
	    }
	

}

