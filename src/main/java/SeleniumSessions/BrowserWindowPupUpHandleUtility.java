package SeleniumSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowPupUpHandleUtility {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		System.out.println("------------------Popup #1--------------------");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		Set<String> handles = driver.getWindowHandles(); 
		ArrayList<String> handlesList = getHandlesList(driver, handles);
//		System.out.println(handlesList);
	
		String parentWindowID = handlesList.get(0);
		System.out.println("parent window id is: "+ parentWindowID);
		String child1WindowID = handlesList.get(1);
		System.out.println("child1 window id is: "+ child1WindowID);
		driver.switchTo().window(child1WindowID);
		System.out.println("child1 window title is: "+ driver.getTitle());
		driver.close(); 
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title is: "+ driver.getTitle());
		
		System.out.println("------------------Popup #2--------------------");
		
		driver.findElement(By.linkText("Good PopUp #2")).click();
		handles = driver.getWindowHandles(); 
		handlesList = getHandlesList(driver, handles);
	
		parentWindowID = handlesList.get(0);
		System.out.println("parent window id is: "+ parentWindowID);
		String child2WindowID = handlesList.get(1);
		System.out.println("child2 window id is: "+ child2WindowID);
		driver.switchTo().window(child2WindowID);
		System.out.println("child2 window title is: "+ driver.getTitle());
		driver.close(); 
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title is: "+ driver.getTitle());
		
		System.out.println("------------------Popup #3--------------------");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		handles = driver.getWindowHandles(); 
		handlesList = getHandlesList(driver, handles);
	
		parentWindowID = handlesList.get(0);
		System.out.println("parent window id is: "+ parentWindowID);
		String child3WindowID = handlesList.get(1);
		System.out.println("child3 window id is: "+ child3WindowID);
		driver.switchTo().window(child3WindowID);
		System.out.println("child3 window title is: "+ driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title is: "+ driver.getTitle());
		
		System.out.println("------------------Popup #4--------------------");
		
		driver.findElement(By.linkText("Good PopUp #4")).click();
		handles = driver.getWindowHandles(); 
		handlesList = getHandlesList(driver, handles);
	
		parentWindowID = handlesList.get(0);
		System.out.println("parent window id is: "+ parentWindowID);
		String child4WindowID = handlesList.get(1);
		System.out.println("child4 window id is: "+ child4WindowID);
		driver.switchTo().window(child4WindowID);
		System.out.println("child4 window title is: "+ driver.getTitle());
		driver.close(); 
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title is: "+ driver.getTitle());

	}

	public static ArrayList<String> getHandlesList(WebDriver driver, Set<String> handles) {
		ArrayList<String> ar = new ArrayList<String>(handles);	
		return ar;
	}
}
