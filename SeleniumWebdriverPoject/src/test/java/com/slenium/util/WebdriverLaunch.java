package com.slenium.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebdriverLaunch {
	
	
	public static WebDriver driver ;
	
	
	
	public static WebDriver browserFirefox(WebDriver driver ){
		System.setProperty("webdriver.firefox.marionette","D://sw/Selenium/geckodriver.exe");
		
		driver = new FirefoxDriver();	
		
		return driver;
		
	}
	
	
	public static WebDriver browserChrome(WebDriver driver ){
		System.setProperty("webdriver.chrome.driver","D:/sw/Selenium/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();	
		
		return driver;
		
	}
	
	
	public static WebDriver browserIE(WebDriver driver ){
		System.setProperty("webdriver.ie.driver","D://sw/Selenium/IEdriver/IEDriverServer.exe");
		
		driver = new InternetExplorerDriver();	
		
		return driver;
		
	}

}
