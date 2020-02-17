package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("https://app.hubspot.com/login"); //launch url
		Thread.sleep(5000);
		
		// first create the web element and perform some action on it
		//actions - click, sendKeys, getText etc
		
		//1.id: always unique -- 1st preference
//		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test@123");
//		driver.findElement(By.id("loginBtn")).click();
		
//		WebElement emailID = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		
//		emailID.sendKeys("test@gmail.com");
//		password.sendKeys("test123");
//		loginBtn.click();
		
		//2. name: -- 2nd preference
		//driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		
		//3. Xpath: is a locator (address of the element in DOM) but it is not an attribute -- 5th preference
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@123");
		
		//4. cssSelector: is a locator with the help of tag and attribute, but its not an attribute -- 4th preference
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("test123");
		
		//5. class name: is not an unique attribute(locator). Same class can be assigned to multiple elements. -- 3rd preference
//		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("login-password")).sendKeys("test123");
		
//		form-control private-form__control login-email
//		form-control private-form__control login-password m-bottom-3
		
		//6. linkText: only for links or URLs
//		driver.findElement(By.linkText("Forgot my password")).click();
		
		//7. partial link text: only for links
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		//Forgot my password
		//Forgot my userid
		//this renders partialLinkText is not good practice
		
		//8. tagName
	}

}
