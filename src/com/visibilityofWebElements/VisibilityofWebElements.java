package com.visibilityofWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityofWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
	       ChromeDriver driver= new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       driver.manage().window().maximize();
	     
	       WebElement Createaccount= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		      Createaccount.click();
		      
	   WebElement Firstname = driver.findElement(By.name("firstname"));
	   boolean name =Firstname.isDisplayed();
	   boolean name1 =Firstname.isEnabled();
	   System.out.println(name);
	   System.out.println(name1);
	   Firstname.sendKeys("Charanteja");
	   
	   WebElement Lastname= driver.findElement(By.name("lastname"));
	   boolean LASTNAME =Lastname.isDisplayed();
	   boolean LASTNAME1 =Lastname.isEnabled();	
	      System.out.println(LASTNAME);
	      System.out.println(LASTNAME1);
	      Lastname.sendKeys("Thumati");
	      
	      
	      
//		     WebElement Checkbox= driver.findElement(By.id("sex"));
//		     boolean checkbox= Checkbox.isSelected();
//		      System.out.println(checkbox);
//		      Checkbox.click();
//		      System.out.println(Checkbox.isSelected());
	      
	      WebElement Checkbox1= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[2]/label/input"));
		     boolean checkbox1= Checkbox1.isSelected();
		      System.out.println(checkbox1);
		      Checkbox1.click();
		      System.out.println(Checkbox1.isSelected());
//	      
//		      WebElement Checkbox2= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[3]/label/input"));
//			     boolean checkbox2= Checkbox2.isSelected();
//			      System.out.println(checkbox2);
//			      Checkbox2.click();
//			      System.out.println(Checkbox2.isSelected());
	      
		      driver.findElement(By.name("reg_email__")).sendKeys("9999999999");
		      driver.findElement(By.id("password_step_input")).sendKeys("Cherry@123");
		   WebElement Signup =   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button"));
		   Signup.click(); 
		      
	}

}

