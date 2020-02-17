package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPupUpHandleCase1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		driver.findElement(By.linkText("Good PopUp #2")).click();
		driver.findElement(By.linkText("Good PopUp #3")).click();
		driver.findElement(By.linkText("Good PopUp #4")).click();
		
		
		// ******************CASE 1*******************
		
		System.out.println("+++++++++++++++++  Case 1   ++++++++++++++++++");
		
		System.out.println("------------------Popup #1--------------------");
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		System.out.println("parent window id is: "+ parentWindowID);
		String childWindowID = it.next();
		System.out.println("child1 window id is: "+ childWindowID);
		driver.switchTo().window(childWindowID);
		System.out.println("child1 window title is: "+ driver.getTitle());
		driver.close(); 
		
		System.out.println("------------------Popup #2--------------------");
		
		childWindowID = it.next();
		System.out.println("child2 window id is: "+ childWindowID);
		driver.switchTo().window(childWindowID);
		System.out.println("child2 window title is: "+ driver.getTitle());
		driver.close(); 
		
		System.out.println("------------------Popup #3--------------------");
		
		childWindowID = it.next();
		System.out.println("child3 window id is: "+ childWindowID);
		driver.switchTo().window(childWindowID);
		System.out.println("child3 window title is: "+ driver.getTitle());
		driver.close(); 
		
		System.out.println("------------------Popup #4--------------------");
		
		childWindowID = it.next();
		System.out.println("child4 window id is: "+ childWindowID);
		driver.switchTo().window(childWindowID);
		System.out.println("child4 window title is: "+ driver.getTitle());
		driver.close(); 
		
	}

}
