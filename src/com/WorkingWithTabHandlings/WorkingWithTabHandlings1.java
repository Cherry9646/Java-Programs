package com.WorkingWithTabHandlings;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTabHandlings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ChromeDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.facebook.com/");
           driver.switchTo().newWindow(WindowType.TAB);
           driver.get("https://www.hdfcbank.com/");
           driver.switchTo().newWindow(WindowType.TAB);
           driver.get("https://www.hyrtutorials.com/");
         
      driver.switchTo().newWindow(WindowType.WINDOW); 
      driver.get("https://www.w3schools.com/");
      driver.switchTo().newWindow(WindowType.WINDOW); 
      driver.get("https://the-internet.herokuapp.com/");
      
      driver.close();
      
      
      
          
           
	}            

}
