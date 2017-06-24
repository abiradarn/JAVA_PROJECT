package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.slenium.util.WebdriverLaunch;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Hi");
		WebDriver driver = null;
		
		driver = WebdriverLaunch.browserFirefox(driver);
		
		//Explicit wait
		WebDriverWait driverWait  = new WebDriverWait(driver, 10);
		
		driver.get("http://newtours.demoaut.com/");
		
		//wait until text box load
		
		
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		
		//Enter value 
		
		driver.findElement(By.name("userName")).sendKeys("Abhi");
		driver.findElement(By.name("userName")).clear();
		
		
		//Access Links
		driver.findElement(By.linkText("Register here")).click();
		driver.findElement(By.name("firstName")).sendKeys("Girija");
		driver.findElement(By.name("lastName")).sendKeys("Abhi");
		driver.findElement(By.name("phone")).sendKeys("Girija");
		driver.findElement(By.id("userName")).sendKeys("Girija");
		driver.findElement(By.name("address1")).sendKeys("Girija");
		driver.findElement(By.name("address2")).sendKeys("Girija");
		driver.findElement(By.name("city")).sendKeys("Bangalore");
		driver.findElement(By.name("state")).sendKeys("Karnataka");
		driver.findElement(By.name("postalCode")).sendKeys("560002");
		driver.findElement(By.id("email")).sendKeys("a.girija2013@gmail.com");
		Select drop = new Select(driver.findElement(By.name("country")));
		drop.selectByVisibleText("INDIA");
		
		
		driver.findElement(By.name("password")).sendKeys("Girija12");
		driver.findElement(By.name("confirmPassword")).sendKeys("Girija12");
		
		driver.findElement(By.name("register")).click();
		
		
		
		
		
		
		
		driver.findElement(By.partialLinkText("sign")).click();

		driver.findElement(By.name("userName")).sendKeys("a.girija2013@gmail.com");
		driver.findElement(By.name("password")).sendKeys("agirija12");
		driver.findElement(By.name("login")).click();
		
		
		
		/*driver = WebdriverLaunch.browserIE(driver);
		
		driver.get("http://www.seleniumeasy.com");
		
		
		*/
		/*
		WebDriver driver ;
    	System.setProperty("webdriver.firefox.marionette","D://sw/Selenium/geckodriver.exe");
    	driver = new FirefoxDriver();
		//WebDriver driver = (WebDriver) new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver","D:/sw/Selenium/chromedriver/chromedriver.exe");
    	//driver = new ChromeDriver();
		
		System.out.println("Application");
		driver.get("http://www.seleniumeasy.com");
		
		Thread.sleep(1500);
		
		driver.navigate().to("http://google.com");
		
		//driver.close();
		*/
	}

}
