package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //global wait - will be applied on all web elements
		
		driver.get("https://app.hubspot.com/login"); //launch url
		
//		Thread.sleep(5000); //this is a static wait and not good practice
		
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //wait is reduced as needed
		
		driver.findElement(By.id("password")).sendKeys("test@x123");
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); //overwrite when not needed

		
	}

}
