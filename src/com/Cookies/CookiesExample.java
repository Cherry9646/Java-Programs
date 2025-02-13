package com.Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");		
		Set<Cookie> cookie =driver.manage().getCookies();
		System.out.println(cookie.size());
	}

}
