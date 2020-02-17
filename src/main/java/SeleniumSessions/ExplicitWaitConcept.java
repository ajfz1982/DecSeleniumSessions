package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		// WebDriverWait - can be applied for specific elements, title, url, and much more......
		// ExplicitWait
		
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //global wait - will be applied for all web elements
		driver.get("https://app.hubspot.com/login"); //launch url
		
		By emailID = By.id("username");
		By password = By.id("password");
		
		//tries for 3 sec with 500 msec intervals
		//TimeOutException
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(emailID));
		driver.findElement(emailID).sendKeys("test@gmail.com"); //wait of 15 sec applies only for this web element
		
//		wait.until(ExpectedConditions.presenceOfElementLocated(password)); // explicit wait applied whenever needed
		driver.findElement(password).sendKeys("test@123");

	}

}
