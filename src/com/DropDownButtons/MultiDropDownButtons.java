package com.DropDownButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDownButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://omayo.blogspot.com/");
	      driver.manage().window().maximize();
	 WebElement multiselection=     driver.findElement(By.id("multiselect1"));
	 Select select = new Select(multiselection);
	List<WebElement> dropdowns =select.getOptions();
	int dropdown =dropdowns.size();
	System.out.println(dropdowns.size());
	for(int i=0;i<+dropdowns.size();i++) {
		System.out.println(dropdowns.get(i).getText());		
	}
	for(WebElement values:dropdowns) {
		System.out.println(values.getText());
	}
	select.selectByIndex(3);
	select.selectByValue("swiftx");
	List<WebElement> drops=select.getAllSelectedOptions();
	for(WebElement we:drops) {
		System.out.println("selected text ="+we.getText());
		//select.deselectAll();
	}
	
	}

}
