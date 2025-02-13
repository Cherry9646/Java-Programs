package com.RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
    
      
      driver.get("https://echoecho.com/htmlforms10.htm");
      driver.manage().window().maximize();
     WebElement tableproperty= driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table"));
	
	 List<WebElement> group1Elements =driver.findElements(By.name("group1"));  
	 int Element =group1Elements.size();
	 System.out.println(group1Elements.size());
	  
	 int group1index=2;
	 group1Elements.get(group1index).click();
	 for(WebElement index :group1Elements) {
		 String Elements =index.isSelected()?"selected":null;
		 System.out.println(index.getAttribute("value") + "=" + Elements);
	 }
	 
	List<WebElement> group2Elements =driver.findElements(By.name("group2"));
    int Elememts=	group2Elements.size();
    
    System.out.println(group2Elements.size());
    
      int group2Index =0;
      group2Elements.get(group2Index).click();
      for(WebElement Index : group2Elements) {
    	String Elements1=  Index.isSelected()? "selected": null;
    	System.out.println(Index.getAttribute("value") + "=" + Elements1);
      }
	 
	 
	}

}
