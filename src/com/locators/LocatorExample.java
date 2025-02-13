package com.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
	       ChromeDriver obj= new ChromeDriver();
	       obj.get("https://www.facebook.com/");
	       obj.manage().window().maximize();
	     //  <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" 
	       //data-testid="royal-email" placeholder="Email address or phone number" 
	       //autofocus="1" aria-label="Email address or phone number">
	       
	       //ID
	       //obj.findElement(By.id("email")).sendKeys("charan333.thumati@gamil.com");
	       
	       //or
			/*
			  WebElement obj2 = obj.findElement(By.id("email"));
			  obj2.sendKeys("tejacherry@gamil.com");  */
	       //or
//	         String UserName = "ranjithl2003@gmail.com";
//	                  By user =By.id("email");
//	                 WebElement obj3=  obj.findElement(user);
//	                  obj3.sendKeys(UserName);
	       
	                 
	       //Name
	       //obj.findElement(By.name("email")).sendKeys("Testing");
	       
	       //ClassName
	       //obj.findElement(By.className("inputtext")).sendKeys("charan");
	       
	       //tagname
//	      List<WebElement> link = obj.findElements(By.tagName("a"));
//	      System.out.println(link.size());
	       
	       //Xpath
//	WebElement email =   obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
//	      email.sendKeys("charan");
	       
	       
	       //Relative Xpath
// WebElement email = obj.findElement(By.xpath("//*[@id=\"email\"]"));
//email.sendKeys("teja");
	      //obj.findElement(By.xpath("//input[@ id='email']")).sendKeys("charan");
	       
	       //CSS Selector
//   WebElement obj2=  obj.findElement(By.cssSelector("#email"));
//      obj2.sendKeys("Cherry");
	       obj.findElement(By.cssSelector("input[id='email']")).sendKeys("Cherry");
	       
	}     

}
