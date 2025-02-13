package com.WorkingWithAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
	     WebElement alertProperty=	driver.findElement(By.id("alertBox"));
	     alertProperty.click();
	     Thread.sleep(3000);
	    	     
	    Alert alerttext= driver.switchTo().alert();
	  String text=  alerttext.getText();
	    System.out.println(text);
	    //alerttext.accept();
	     
	    //driver.switchTo().alert().accept();
	
	    alerttext.dismiss();
		
	}

}
