package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPupUpHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles(); 
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowID = it.next(); 
		
		System.out.println("parent window id is: "+ parentWindowID);
		
		String childWindowID = it.next(); //put in ArrayList
		
		System.out.println("child window id is: "+ childWindowID);
		
		driver.switchTo().window(childWindowID);
		
		System.out.println("child window title is: "+ driver.getTitle());
		
		driver.close(); //do not use quit method.....that will close browser and not window
		
		driver.switchTo().window(parentWindowID);
		
		System.out.println("parent window title is: "+ driver.getTitle());
		
	}

}
