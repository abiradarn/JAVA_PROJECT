package com.ecomerce.app.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppLoad {
	
	public static  WebDriver driver1 = null;
	
	
	public static  WebDriver launchingApplicaion(String url){
	  
	   
	   driver1 = new FirefoxDriver();
	   driver1.get(url);
		
		return driver1;
		
	}

}
