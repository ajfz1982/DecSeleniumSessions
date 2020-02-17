package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("https://app.hubspot.com/login"); //launch url
		Thread.sleep(5000);
		
		//By Locators
		By emailID = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		By forgotPassword = By.linkText("Forgot my password");
		
		//create webelement with By locators and performing action on it
//		driver.findElement(emailID).sendKeys("test@gmail.com");
//		driver.findElement(password).sendKeys("test123");
//		driver.findElement(loginButton).click();
//		driver.findElement(forgotPassword).click();
		
		doSendKeys(emailID, "test@gmail.com");
		doSendKeys(password, "test123");
		doClick(loginButton);
		doClick(forgotPassword);
		
	}

	/** this method is used to create the webelement on the basis of By locator
	 * @param locator
	 * @param driver
	 * @return
	 */
	
	public static WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	public static void doSendKeys(By locator, String value) {
		WebElement element = getElement(locator);
//		getElement(locator).sendKeys(value);
		element.clear();
		element.sendKeys(value);
	}

	public static void doClick(By locator){
		getElement(locator).click();
	}

}
