package com.WorkingWithAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlerts1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		 WebElement AlertProperty =driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button"));
		 AlertProperty.click();
		 Alert Alerttext=driver.switchTo().alert();
	     //System.out.println(Alerttext.getText());
	     Alerttext.sendKeys("charan");
	     Thread.sleep(3000);
	     driver.switchTo().alert().accept();
		
	}

}
