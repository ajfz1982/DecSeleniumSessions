package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		// L1 --> L2
		
//		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146"); //launch url
//		
//		WebElement contentLink = driver.findElement(By.className("menulink"));
		
//		Actions actions = new Actions(driver);		
//		actions.moveToElement(contentLink).build().perform(); //whenever we use actions class method - we always have to use build and perform method	
//		Thread.sleep(2000);
		
//		moveToElement(contentLink, driver); //replaces above code block by use of generic method
//		
//		driver.findElement(By.linkText("COURSES")).click();
		
		// L1 --> L2 --> L3
		
		driver.get("https://www.spicejet.com/"); //launch url
		
		WebElement parentLink = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		WebElement childLink = driver.findElement(By.cssSelector("#smoothmenu1 > ul > li.li-login.float-right.tabres > ul > li:nth-child(2) > a"));
		
		moveToElement(parentLink, childLink, driver); 
		
		driver.findElement(By.linkText("Sign up")).click();	
	}

	
	public static void moveToElement(WebElement element, WebDriver driver) throws InterruptedException {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform(); 
		Thread.sleep(2000);
		
	}
	
	public static void moveToElement(WebElement element1, WebElement element2, WebDriver driver) throws InterruptedException {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element1).build().perform(); 
		actions.moveToElement(element2).build().perform(); 
		Thread.sleep(2000);
		
	}
}
