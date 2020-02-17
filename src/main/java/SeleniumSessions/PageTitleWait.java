package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageTitleWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //global wait - will be applied on all web elements
		
		driver.get("http://www.amazon.com"); //launch url
		
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.titleContains("HubSpot"));
		
//		System.out.println(driver.getTitle()); //in this case - implicitlywait wont be applied for title, but explicit wait can be used for non web element
//		System.out.println(driver.getCurrentUrl());
		
		List<WebElement> list = driver.findElements(By.tagName("a")); //ImplcitlyWait will be applied only when this List<WebElement> is created
		System.out.println(list.size());
		
		
	}

}
