package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPupUpHandleCase2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		// ******************CASE 2*******************
		
		System.out.println("+++++++++++++++++  Case 2   ++++++++++++++++++");
		
		System.out.println("------------------Popup #1--------------------");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		System.out.println("parent window id is: "+ parentWindowID);
		String childWindowID = it.next();
		System.out.println("child window id is: "+ childWindowID);
		driver.switchTo().window(childWindowID);
		System.out.println("child window title is: "+ driver.getTitle());
		driver.close(); 
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title is: "+ driver.getTitle());
		
		System.out.println("------------------Popup #2--------------------");
		
		driver.findElement(By.linkText("Good PopUp #2")).click();
		handles = driver.getWindowHandles();
		it = handles.iterator();
		parentWindowID = it.next();
		System.out.println("parent window id is: "+ parentWindowID);
		childWindowID = it.next();
		System.out.println("child window id is: "+ childWindowID);
		driver.switchTo().window(childWindowID);
		System.out.println("child window title is: "+ driver.getTitle());
		driver.close(); 
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title is: "+ driver.getTitle());
		
		System.out.println("------------------Popup #3--------------------");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		handles = driver.getWindowHandles();
		it = handles.iterator();
		parentWindowID = it.next();
		System.out.println("parent window id is: "+ parentWindowID);
		childWindowID = it.next();
		System.out.println("child window id is: "+ childWindowID);
		driver.switchTo().window(childWindowID);
		System.out.println("child window title is: "+ driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title is: "+ driver.getTitle());
		
		System.out.println("------------------Popup #4--------------------");
		
		driver.findElement(By.linkText("Good PopUp #4")).click();
		handles = driver.getWindowHandles();
		it = handles.iterator();
		parentWindowID = it.next();
		System.out.println("parent window id is: "+ parentWindowID);
		childWindowID = it.next();
		System.out.println("child window id is: "+ childWindowID);
		driver.switchTo().window(childWindowID);
		System.out.println("child window title is: "+ driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title is: "+ driver.getTitle());
		
	}

}
