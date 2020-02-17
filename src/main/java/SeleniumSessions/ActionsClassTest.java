package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionsClassTest { //this is the clean approach

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		
		ChromeOptions co = new ChromeOptions();
        co.addArguments("--headless");
        
		
		WebDriver driver = new ChromeDriver(co); //launch chrome browser
		
		driver.get("https://app.hubspot.com/login");

		Thread.sleep(5000);
		
		ElementActions elementActions = new ElementActions(driver);
		
		System.out.println(elementActions.doGetTitle());
		
//		//By locators
//		By emailID = By.id("username");
//		By password = By.id("password");
//		By loginButton = By.id("loginBtn");
//		
//		elementActions.doActionSendKeys(emailID, "test@gmail.com");
//		elementActions.doActionSendKeys(password, "test@123");
//		elementActions.doActionsClick(loginButton);
	}

}
