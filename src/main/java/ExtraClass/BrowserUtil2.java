package ExtraClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil2{
	WebDriver driver;
	public WebDriver getDriver(String browserName) {
		if (browserName.equals("chrome")){
			WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();	
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("safari")){
			WebDriverManager.getInstance(SafariDriver.class).setup();	
			driver = new SafariDriver();
		}
		else {
			System.out.println("browser value is not correct, please pass the correct browser name");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		return driver;
	}
}
