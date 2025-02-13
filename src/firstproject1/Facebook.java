package firstproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\BrowserDriverFiles\\chromedriver.exe");
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://facebook.com/");
        obj.manage().window().maximize();
        

        
        WebElement Createaccount= obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		      Createaccount.click();
		      
		      WebElement firstname = obj.findElement(By.name("firstname"));
			   boolean name =firstname.isDisplayed();
			   boolean name1 =firstname.isEnabled();
			   System.out.println(name);
			   System.out.println(name1);
			   firstname.sendKeys("sai");
			   
			   WebElement Lastname = obj.findElement(By.name("lastname"));
			   boolean LASTname =Lastname.isDisplayed();
			   boolean LASTname1 =Lastname.isEnabled();
			   System.out.println(LASTname);
			   System.out.println(LASTname1);
			   Lastname.sendKeys("reddy");
			 
			   WebElement box= obj.findElement(By.id("sex"));
			     boolean checkbox= box.isSelected();
			      System.out.println(checkbox);
			      box.click();
			      System.out.println(box.isSelected());
			      Thread.sleep(500);
			      WebElement Box1= obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[2]/label/input"));
				     boolean checkbox1= Box1.isSelected();
				      System.out.println(checkbox1);
				      Box1.click();
				      System.out.println(Box1.isSelected());
	}

}
