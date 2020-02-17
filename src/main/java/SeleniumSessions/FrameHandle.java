package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("http://londonfreelance.org/courses/frames/index.html"); //launch url
		
		int frameCount = driver.findElements(By.tagName("frame")).size();
		System.out.println(frameCount);
	
		switchFrameName(driver, "main");
//		switchFrameIndex(driver, 2);
//		switchFrameElementName(driver, "main");
		
		String text = driver.findElement(By.xpath("/html/body/h2")).getText(); //get Title 
		System.out.println(text);
		
		driver.switchTo().defaultContent(); //To return to main document
		driver.switchTo().parentFrame(); //To return to parent context or frame
		}
	
	public static void switchFrameName(WebDriver driver, String value) {
		driver.switchTo().frame(value); // by passing name or id
	}
	
	public static void switchFrameIndex(WebDriver driver, int value) {
		driver.switchTo().frame(value); // by passing name or id
	}
	
	public static void switchFrameElementName(WebDriver driver, String value) {
		driver.switchTo().frame(driver.findElement(By.name(value))); //passing frame webelement, better practice when name or id not available
	}

}
