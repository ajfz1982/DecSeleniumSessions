package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("https://app.hubspot.com/login"); //launch url //version 1 of dom
		
		Thread.sleep(5000);
		
		WebElement userID = driver.findElement(By.id("username")); 
		userID.sendKeys("test@gmail.com");
		
		driver.navigate().refresh(); //version 2 of dom
		userID = driver.findElement(By.id("username"));  //-- done to eliminate stale element reference exception
		userID.sendKeys("test1@gmail.com");
		
	}

}
