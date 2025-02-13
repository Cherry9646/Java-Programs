package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// password text box
public class LocatorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
	       ChromeDriver obj= new ChromeDriver();
	       obj.get("https://www.facebook.com/");
	      // <input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" 
	    		   //data-testid="royal-pass" placeholder="Password" aria-label="Password">
              //ID
	     obj.findElement(By.id("email")).sendKeys("9959829646");
	      obj.findElement(By.id("pass")).sendKeys("charanteja3333");
	     //or
	        //WebElement Password = obj.findElement(By.id("pass"));
	       // Password.sendKeys("Charanteja3333");
	       
	        //name	       
	   // obj.findElement(By.name("pass")).sendKeys("Charanteja");
	    //or
	       //WebElement Password = obj.findElement(By.name("pass"));
	       //Password.sendKeys("Charan");
	     
	    //Absolute Xpath
//	        WebElement Password = obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
//	     	        Password.sendKeys("Teja");
	     	        
	   //Relative Xpath
//	    WebElement Password= obj.findElement(By.xpath("//*[@id=\"pass\"]"));
//	     	        Password.sendKeys("Cherry123");
	     	        //or
	     	      //  obj.findElement(By.xpath("//input[@id='pass']")).sendKeys("Cherry");
	     
	     //CssSelector
	     //obj.findElement(By.cssSelector("input[pass='Cherry123']"));
	     //or
//	      WebElement Password=  obj.findElement(By.cssSelector("#pass"));
//	      Password.sendKeys("Charan123");
	      
	     obj.findElement(By.name("login")).click();
	       }

}
