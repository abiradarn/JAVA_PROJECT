import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Helloworld");
		
		
		/*
		System.setProperty("webdriver.chrome.driver", "F://sw/Selenium/chromedriver/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.seleniumeasy.com");*/
		System.setProperty("webdriver.gecko.driver","F://sw/jars/selenium/geckodriver-v0.15.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Application");
		driver.get("https://www.seleniumeasy.com");
		Thread.sleep(1000);
		/*Thread.sleep(1000);
		Thread.sleep(1000);*/
		
		 //WebElement closeWindow = driver.findElement(By.className("mc-closeModal"));
		System.out.println("$$$$$$$$$$$$$$$$$");
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 WebElement closeWindow1 =  (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mc-closeModal")));
		 
		 System.out.println("$$$$$$$$$$$$$$$$$");
		 if(closeWindow1.isDisplayed()){
			 System.out.println("Element is visible");
			 
			 closeWindow1.click();
		
		
		 }
		 
		 driver.findElement(By.xpath("//a[@href='/selenium-tutorials']")).click();
	}
}
