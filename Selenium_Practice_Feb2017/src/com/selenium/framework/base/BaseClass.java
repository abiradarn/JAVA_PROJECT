package com.selenium.framework.base;

import org.openqa.selenium.WebDriver;

public class BaseClass {

	
		public static  WebDriver driver =null ;
		public int a,b;
		
		
		public  WebDriver openFireFox(WebDriver driver,int a){
			this.driver = driver;
			this.a = a;
			
			
			return driver;
		}
		 
}
