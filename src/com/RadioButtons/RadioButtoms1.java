package com.RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtoms1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://echoecho.com/htmlforms10.htm");
	      driver.manage().window().maximize();
	     WebElement tableproperty= driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table"));
		 
	     List<WebElement> Elements= driver.findElements(By.name("group1"));
	     System.out.println(Elements.size());
	     
	     for(int i=0;i<3;i++) {
	    	 Elements.get(i).click();
	    	 for(int c=0;c<3;c++) {
	    		String charan = Elements.get(c).getAttribute("value")+" "+ Elements.get(c).getAttribute("checked");
	    	 System.out.println(charan);
	    	 
	    	 }
	     }
	     
	    	 List<WebElement> elements =driver.findElements(By.name("group2"));
	    	 int group2 =elements.size();
	    	 System.out.println(elements.size());
	    	
	    	 for(int i=0;i<3;i++) {
	    		 elements.get(i).click();
	    		 for(int c=0;c<3;c++) {
	    		String Cherry=	 elements.get(c).getAttribute("value")+" "+elements.get(c).getAttribute("checked");
	    			 System.out.println(Cherry);
	    		 }
	    		 
	    	 }
	     
	     
	}

}
