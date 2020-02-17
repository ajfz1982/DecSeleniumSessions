package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
//		call BrowserUtil class 'driver'		
		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("Chrome");
		
		ElementActions elementActions = new ElementActions(driver);
		
//		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
//		driver = new ChromeDriver(); //launch chrome browser
//		ElementActions elementActions = new ElementActions(driver);
	
		elementActions.launchUrl("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		//By Locators
		By emailID = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		By forgotPassword = By.linkText("Forgot my password");
		

		elementActions.doSendKeys(emailID, "test@gmail.com");
		elementActions.doSendKeys(password, "test@123");
		elementActions.doClick(loginButton);
		elementActions.doClick(forgotPassword);

	}

}
