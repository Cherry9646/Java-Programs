package com.WorkingWithFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
          ChromeDriver driver =new ChromeDriver();
          driver.get("https://jqueryui.com/droppable/");
          driver.manage().window().maximize();
     WebElement Frame=     driver.findElement(By.className("demo-frame"));
     driver.switchTo().frame(Frame);
     
     WebElement Drag =driver.findElement(By.id("draggable"));          
     String DragText=Drag.getText();
     System.out.println(DragText);
     
      WebElement Drop =driver.findElement(By.id("droppable"));
      System.out.println(Drop.getText());
      
      Actions action =new Actions(driver);
     action.dragAndDrop(Drag, Drop).build().perform();
     driver.switchTo().defaultContent();
     	
   WebElement resizable =  driver.findElement(By.linkText("Resizable"));
   resizable.click();
   Thread.sleep(3000);
   
  WebElement Sortable= driver.findElement(By.linkText("Sortable"));
  Sortable.click();
	}

}
