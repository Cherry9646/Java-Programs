package com.RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://echoecho.com/htmlforms10.htm");
       driver.manage().window().maximize();
      WebElement tableProperty = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table"));
	    
       List<WebElement> groupElements= driver.findElements(By.name("group1"));
     int  groupElementssize= groupElements.size(); //3 -> 0, 1, 2
     System.out.println(groupElements.size());
     
          int selectRadioIndex = 2; // give the index value for the radio button.
	 groupElements.get(selectRadioIndex).click(); // check the milk as selected.
		
		  for(WebElement Element : groupElements) {
			  String isSelected = Element.isSelected() ? "selected" : null;
			  
			  System.out.println("name = " + Element.getAttribute("value") + ", value = " + isSelected); 
		  
		  }		 
         
     
     List<WebElement> groupElements2= driver.findElements(By.name("group2"));
    int  groupElementssize2 =groupElements2.size();
     System.out.println(groupElements.size());      
           
           int SelectRadioIndex = 2;
           groupElements2.get(SelectRadioIndex).click();
	      
           for(WebElement Elements: groupElements2) {
        	 String element =  Elements.isSelected()? "selected": null;
        	   System.out.println("name =" + Elements.getAttribute("value")+", value="+ element);
        	            }
	      
	      
	      
	}

}
