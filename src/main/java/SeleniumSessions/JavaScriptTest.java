package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/login");
//		driver.get("https://classic.crmpro.com");
		Thread.sleep(5000);
		
//		JavaScriptUtil.generateAlert(driver, "hi this is my popup");
		
//		JavaScriptUtil.refreshBrowserByJS(driver);
		
//		WebElement element = driver.findElement(By.linkText("Sign up"));
		WebElement element = driver.findElement(By.linkText("Forgot my password"));
//		JavaScriptUtil.clickElementByJS(element, driver);
		
//		JavaScriptUtil.sendKeysUsingJSWithId(driver, "username", "naveen@gmail.com");
	
//		System.out.println(JavaScriptUtil.getBrowserInfo(driver));
//		
//		System.out.println(JavaScriptUtil.getPageInnerText(driver));
		
//		System.out.println(JavaScriptUtil.getTitleByJS(driver));
		
//		JavaScriptUtil.drawBorder(element, driver);
		
//		JavaScriptUtil.flash(element, driver);
		
//		JavaScriptUtil.scrollPageDown(driver);
		
		JavaScriptUtil.scrollIntoView(element, driver);
		
		element.click();
		
	}

}
