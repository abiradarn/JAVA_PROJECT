package com.ecomerce.app.base;

import java.sql.Driver;

import org.eclipse.jdt.internal.compiler.ast.SuperReference;
import org.openqa.selenium.WebDriver;

public class MoneyControlInitialClass{
	public static WebDriver driver = null;
	
	
	
	
	public static String url = "http://www.moneycontrol.com/india/stockpricequote/consumer-goods-white-goods/symphony/SCS04";
	
	public static void launch() throws InterruptedException{
		System.out.println("Loading an Application");
		//System.setProperty("webdriver.gecko.driver","F://sw/jars/selenium/geckodriver-v0.15.0-win64/geckodriver.exe");
		driver= AppLoad.launchingApplicaion(url);
		Thread.sleep(1000);
		System.out.println("Application is launched ");
	}
	//public String hello = "HELLO";
	
	public static void appClose(WebDriver driver){
		driver.close();
		System.out.println("Page is closed");
		//driver.quit();
		System.out.println("Application is closed");
	}
	
	public static void main(String[] args) throws InterruptedException {
		launch();
		Thread.sleep(1000);
		appClose(driver);
		//driver= AppLoad.launchingApplicaion(url);
	}
	
	
	
	

}
